/*
 * Copyright (c) G42 Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.g42cloud.sdk.core.auth;

import com.g42cloud.sdk.core.Constants;
import com.g42cloud.sdk.core.exception.SdkException;
import com.g42cloud.sdk.core.http.HttpRequest;
import com.g42cloud.sdk.core.utils.BinaryUtils;
import com.g42cloud.sdk.core.utils.SignUtils;
import com.g42cloud.sdk.core.utils.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * signature certification with AK/SK
 *
 * @author G42Cloud_SDK
 */
public class AKSKSigner {
    /**
     * SHA256 hash of an empty request body
     **/
    public static final String EMPTY_BODY_SHA256 = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

    public static <T extends AbstractCredentials<T>> Map<String, String>
        sign(HttpRequest request, T credential) {
        if (StringUtils.isEmpty(credential.getAk())) {
            throw new SdkException("ak is required in credentials");
        }
        if (StringUtils.isEmpty(credential.getSk())) {
            throw new SdkException("sk in credentials is required");
        }

        // ************* TASK 1: CONSTRUCT CANONICAL REQUEST *************
        // 设置基准时间
        Date now = new Date();
        HashMap<String, String> authenticationHeaders = new HashMap<>();

        // Step 1: add basic headers required by V4
        URL url = request.getUrl();

        // Step 1.1: Add Host header
        String canonicalHost = url.getAuthority();
        authenticationHeaders.put(Constants.HOST, canonicalHost);

        // Step 1.2: Add X-Sdk-Date
        String dateTimeStamp;
        if (!request.haveHeader(Constants.X_SDK_DATE)) {
            SimpleDateFormat isoDateFormat = new SimpleDateFormat(Constants.ISO_8601_BASIC_FORMAT);
            isoDateFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
            dateTimeStamp = isoDateFormat.format(now);
            authenticationHeaders.put(Constants.X_SDK_DATE, dateTimeStamp);
        } else {
            dateTimeStamp = request.getHeader(Constants.X_SDK_DATE);
        }

        // Step 1.3 combine all headers
        Map<String, String> allHeaders = new TreeMap<>();

        allHeaders.putAll(request.getHeaders()
            .entrySet()
            .stream()
            .filter(entry -> (!entry.getKey().startsWith(Constants.CONTENT_TYPE)
                || !entry.getValue().get(0).startsWith(Constants.MEDIATYPE.MULTIPART_FORM_DATA)))
            .collect(
                Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), entry -> entry.getValue().get(0))));
        allHeaders.putAll(authenticationHeaders.entrySet()
            .stream()
            .collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), Map.Entry::getValue)));

        // Step 2: Create Canonical URI -- the part of the URI from domain to query
        String pathOld = url.getPath();
        StringBuilder canonicalUri = new StringBuilder();
        if (pathOld.equals("/")) {
            canonicalUri.append(pathOld);
        } else {
            String[] split = pathOld.split("/");
            for (String urlSplit : split) {
                canonicalUri.append(SignUtils.urlEncode(urlSplit, false)).append("/");
            }
        }

        // Step 3: Create the canonical query string. In this example (a GET request),
        // request parameters are in the query string. Query string values must
        // be URL-encoded (space=%20). The parameters must be sorted by name.
        // For this example, the query string is pre-formatted in the request_parameters variable.
        String query = url.getQuery();
        Map<String, List<String>> parameters = request.getQueryParams();
        String canonicalQueryString = buildCanonicalQueryString(query, parameters);

        // Step 4: Create the list of signed headers. This lists the headers
        // in the canonical_headers list, delimited with ";" and in alpha order.
        // Note: The request can include any headers; canonical_headers and
        // signed_headers lists those that you want to be included in the
        // hash of the request. "Host" and "x-sdk-date" are always required.
        // In V4 signer, we only use required header - host & x-sdk-date.
        String signedHeaderNames = String.join(";", allHeaders.keySet());

        // Step 5: Create the canonical headers and signed headers. Header names
        // and value must be trimmed and lower-case, and sorted in ASCII order.
        // Note that there is a trailing \n.
        String canonicalHeaders = buildCanonicalHeaders(allHeaders);

        // Step 6: Create payload hash (hash of the request body content). For GET
        // requests, the payload is an empty string ("").
        String payloadHash = buildPayloadHash(request);

        // Step 7: Combine elements to create canonical request
        String canonicalRequest = buildCanonicalRequest(request.getMethod().name(), canonicalUri.toString(),
            canonicalQueryString, canonicalHeaders, signedHeaderNames, payloadHash);
        String canonicalRequestHash = BinaryUtils.toHex(sha256(canonicalRequest));
        // ************* TASK 2: CREATE THE STRING TO SIGN*************
        // Match the algorithm to the hashing algorithm you use, either SHA-1 or SHA-256 (recommended)
        String stringToSign = getStringToSign(Constants.SDK_SIGNING_ALGORITHM, dateTimeStamp, canonicalRequestHash);

        // ************* TASK 3: CALCULATE THE SIGNATURE *************
        // Create the signing key using the function defined above.
        String signatureString = signature(stringToSign, credential.getSk());

        // ************* TASK 4: ADD SIGNING INFORMATION TO THE REQUEST *************
        // The signing information can be either in a query string value or in
        // a header named Authorization. This code shows how to use a header.
        // Create authorization header and add to request headers
        StringBuilder authorization = new StringBuilder(Constants.SDK_SIGNING_ALGORITHM).append(" ");
        authorization.append("Access=").append(credential.getAk()).append(", ");
        authorization.append("SignedHeaders=").append(signedHeaderNames).append(", ");
        authorization.append("Signature=").append(signatureString);
        authenticationHeaders.put(Constants.AUTHORIZATION, authorization.toString());

        return authenticationHeaders;
    }

    protected static String buildCanonicalQueryString(String query, Map<String, List<String>> parameters) {
        SortedMap<String, List<String>> sorted = SignUtils.convertQuery2SortedMap(query);

        if (parameters == null || parameters.isEmpty()) {
            return "";
        }

        Iterator<Map.Entry<String, List<String>>> iterator = parameters.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> pair = iterator.next();
            String key = pair.getKey();
            List<String> values = pair.getValue();
            List<String> escapedValues = new ArrayList<>();
            for (String value : values) {
                escapedValues.add(SignUtils.urlEncode(value, false));
            }
            sorted.put(SignUtils.urlEncode(key, false), escapedValues);
        }

        return SignUtils.convertSortedMap2QueryString(sorted);
    }

    /**
     * Create the canonical headers and signed headers. Header names
     * and value must be trimmed and lowercase, and sorted in ASCII order.
     * Note that there is a trailing \n.
     *
     * @param heads
     * @return
     */
    protected static String buildCanonicalHeaders(Map<String, String> heads) {
        StringBuilder sb = new StringBuilder();
        heads.forEach((key, value) -> {
            sb.append(key).append(":").append(value);
            sb.append(Constants.LINE_SEPARATOR);
        });
        return sb.toString();
    }

    /**
     * @param request
     * @return
     */
    protected static String buildPayloadHash(HttpRequest request) {
        if (request.haveHeader(Constants.X_SDK_CONTENT_SHA256)) {
            return request.getHeader(Constants.X_SDK_CONTENT_SHA256);
        }
        if (Objects.nonNull(request.getBodyAsString()) && !request.getBodyAsString().isEmpty()) {
            return BinaryUtils.toHex(sha256(request.getBodyAsString()));
        }

        return EMPTY_BODY_SHA256;
    }

    /**
     * @param segments param1 method
     * param2 canonicalURI
     * param3 canonicalQueryString
     * param4 canonicalHeaders
     * param5 signedHeaderNames
     * param6 payloadHash
     * @return
     */
    protected static String buildCanonicalRequest(String... segments) {
        return String.join(Constants.LINE_SEPARATOR, segments);
    }

    /**
     * @param segments param1 sdkSigningAlgorithm
     * param2 dateTimeStamp
     * param3 credentialScope
     * param4 canonicalRequestHash
     * @return
     */
    protected static String getStringToSign(String... segments) {
        return String.join(Constants.LINE_SEPARATOR, segments);
    }

    /**
     * @param stringToSign
     * @param secretKey
     * @return
     */
    protected static String signature(String stringToSign, String secretKey) {
        byte[] keySecret = secretKey.getBytes(StandardCharsets.UTF_8);
        byte[] signature = hmac(keySecret, stringToSign);
        return BinaryUtils.toHex(signature);
    }

    /**
     * Hashes the string contents (assumed to be UTF-8) using the SHA-256
     * algorithm.
     *
     * @param text string contents
     * @return byte[]
     */
    public static byte[] sha256(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes(StandardCharsets.UTF_8));
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new SdkException("Unable to compute hash while signing request", e);
        }
    }

    protected static byte[] hmac(byte[] key, String data) {
        try {
            Mac hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "HmacSHA256");
            hmac.init(secretKeySpec);
            return hmac.doFinal(data.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new SdkException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }

}
