package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配额信息。
 */
public class QuotaList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_gigabytes")

    private QuotaDetailBackupGigabytes backupGigabytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private QuotaDetailBackups backups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gigabytes")

    private QuotaDetailGigabytes gigabytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots")

    private QuotaDetailSnapshots snapshots;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private QuotaDetailVolumes volumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gigabytes_SATA")

    private QuotaDetailGigabytesSATA gigabytesSATA;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots_SATA")

    private QuotaDetailSnapshotsSATA snapshotsSATA;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_SATA")

    private QuotaDetailVolumesSATA volumesSATA;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gigabytes_SAS")

    private QuotaDetailGigabytesSAS gigabytesSAS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots_SAS")

    private QuotaDetailSnapshotsSAS snapshotsSAS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_SAS")

    private QuotaDetailVolumesSAS volumesSAS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gigabytes_SSD")

    private QuotaDetailGigabytesSSD gigabytesSSD;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots_SSD")

    private QuotaDetailSnapshotsSSD snapshotsSSD;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_SSD")

    private QuotaDetailVolumesSSD volumesSSD;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gigabytes_GPSSD")

    private QuotaDetailGigabytesGPSSD gigabytesGPSSD;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots_GPSSD")

    private QuotaDetailSnapshotsGPSSD snapshotsGPSSD;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_GPSSD")

    private QuotaDetailVolumesGPSSD volumesGPSSD;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_volume_gigabytes")

    private QuotaDetailPerVolumeGigabytes perVolumeGigabytes;

    public QuotaList withBackupGigabytes(QuotaDetailBackupGigabytes backupGigabytes) {
        this.backupGigabytes = backupGigabytes;
        return this;
    }

    public QuotaList withBackupGigabytes(Consumer<QuotaDetailBackupGigabytes> backupGigabytesSetter) {
        if (this.backupGigabytes == null) {
            this.backupGigabytes = new QuotaDetailBackupGigabytes();
            backupGigabytesSetter.accept(this.backupGigabytes);
        }

        return this;
    }

    public QuotaDetailBackupGigabytes getBackupGigabytes() {
        return backupGigabytes;
    }

    public void setBackupGigabytes(QuotaDetailBackupGigabytes backupGigabytes) {
        this.backupGigabytes = backupGigabytes;
    }

    public QuotaList withBackups(QuotaDetailBackups backups) {
        this.backups = backups;
        return this;
    }

    public QuotaList withBackups(Consumer<QuotaDetailBackups> backupsSetter) {
        if (this.backups == null) {
            this.backups = new QuotaDetailBackups();
            backupsSetter.accept(this.backups);
        }

        return this;
    }

    public QuotaDetailBackups getBackups() {
        return backups;
    }

    public void setBackups(QuotaDetailBackups backups) {
        this.backups = backups;
    }

    public QuotaList withGigabytes(QuotaDetailGigabytes gigabytes) {
        this.gigabytes = gigabytes;
        return this;
    }

    public QuotaList withGigabytes(Consumer<QuotaDetailGigabytes> gigabytesSetter) {
        if (this.gigabytes == null) {
            this.gigabytes = new QuotaDetailGigabytes();
            gigabytesSetter.accept(this.gigabytes);
        }

        return this;
    }

    public QuotaDetailGigabytes getGigabytes() {
        return gigabytes;
    }

    public void setGigabytes(QuotaDetailGigabytes gigabytes) {
        this.gigabytes = gigabytes;
    }

    public QuotaList withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QuotaList withSnapshots(QuotaDetailSnapshots snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public QuotaList withSnapshots(Consumer<QuotaDetailSnapshots> snapshotsSetter) {
        if (this.snapshots == null) {
            this.snapshots = new QuotaDetailSnapshots();
            snapshotsSetter.accept(this.snapshots);
        }

        return this;
    }

    public QuotaDetailSnapshots getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(QuotaDetailSnapshots snapshots) {
        this.snapshots = snapshots;
    }

    public QuotaList withVolumes(QuotaDetailVolumes volumes) {
        this.volumes = volumes;
        return this;
    }

    public QuotaList withVolumes(Consumer<QuotaDetailVolumes> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new QuotaDetailVolumes();
            volumesSetter.accept(this.volumes);
        }

        return this;
    }

    public QuotaDetailVolumes getVolumes() {
        return volumes;
    }

    public void setVolumes(QuotaDetailVolumes volumes) {
        this.volumes = volumes;
    }

    public QuotaList withGigabytesSATA(QuotaDetailGigabytesSATA gigabytesSATA) {
        this.gigabytesSATA = gigabytesSATA;
        return this;
    }

    public QuotaList withGigabytesSATA(Consumer<QuotaDetailGigabytesSATA> gigabytesSATASetter) {
        if (this.gigabytesSATA == null) {
            this.gigabytesSATA = new QuotaDetailGigabytesSATA();
            gigabytesSATASetter.accept(this.gigabytesSATA);
        }

        return this;
    }

    public QuotaDetailGigabytesSATA getGigabytesSATA() {
        return gigabytesSATA;
    }

    public void setGigabytesSATA(QuotaDetailGigabytesSATA gigabytesSATA) {
        this.gigabytesSATA = gigabytesSATA;
    }

    public QuotaList withSnapshotsSATA(QuotaDetailSnapshotsSATA snapshotsSATA) {
        this.snapshotsSATA = snapshotsSATA;
        return this;
    }

    public QuotaList withSnapshotsSATA(Consumer<QuotaDetailSnapshotsSATA> snapshotsSATASetter) {
        if (this.snapshotsSATA == null) {
            this.snapshotsSATA = new QuotaDetailSnapshotsSATA();
            snapshotsSATASetter.accept(this.snapshotsSATA);
        }

        return this;
    }

    public QuotaDetailSnapshotsSATA getSnapshotsSATA() {
        return snapshotsSATA;
    }

    public void setSnapshotsSATA(QuotaDetailSnapshotsSATA snapshotsSATA) {
        this.snapshotsSATA = snapshotsSATA;
    }

    public QuotaList withVolumesSATA(QuotaDetailVolumesSATA volumesSATA) {
        this.volumesSATA = volumesSATA;
        return this;
    }

    public QuotaList withVolumesSATA(Consumer<QuotaDetailVolumesSATA> volumesSATASetter) {
        if (this.volumesSATA == null) {
            this.volumesSATA = new QuotaDetailVolumesSATA();
            volumesSATASetter.accept(this.volumesSATA);
        }

        return this;
    }

    public QuotaDetailVolumesSATA getVolumesSATA() {
        return volumesSATA;
    }

    public void setVolumesSATA(QuotaDetailVolumesSATA volumesSATA) {
        this.volumesSATA = volumesSATA;
    }

    public QuotaList withGigabytesSAS(QuotaDetailGigabytesSAS gigabytesSAS) {
        this.gigabytesSAS = gigabytesSAS;
        return this;
    }

    public QuotaList withGigabytesSAS(Consumer<QuotaDetailGigabytesSAS> gigabytesSASSetter) {
        if (this.gigabytesSAS == null) {
            this.gigabytesSAS = new QuotaDetailGigabytesSAS();
            gigabytesSASSetter.accept(this.gigabytesSAS);
        }

        return this;
    }

    public QuotaDetailGigabytesSAS getGigabytesSAS() {
        return gigabytesSAS;
    }

    public void setGigabytesSAS(QuotaDetailGigabytesSAS gigabytesSAS) {
        this.gigabytesSAS = gigabytesSAS;
    }

    public QuotaList withSnapshotsSAS(QuotaDetailSnapshotsSAS snapshotsSAS) {
        this.snapshotsSAS = snapshotsSAS;
        return this;
    }

    public QuotaList withSnapshotsSAS(Consumer<QuotaDetailSnapshotsSAS> snapshotsSASSetter) {
        if (this.snapshotsSAS == null) {
            this.snapshotsSAS = new QuotaDetailSnapshotsSAS();
            snapshotsSASSetter.accept(this.snapshotsSAS);
        }

        return this;
    }

    public QuotaDetailSnapshotsSAS getSnapshotsSAS() {
        return snapshotsSAS;
    }

    public void setSnapshotsSAS(QuotaDetailSnapshotsSAS snapshotsSAS) {
        this.snapshotsSAS = snapshotsSAS;
    }

    public QuotaList withVolumesSAS(QuotaDetailVolumesSAS volumesSAS) {
        this.volumesSAS = volumesSAS;
        return this;
    }

    public QuotaList withVolumesSAS(Consumer<QuotaDetailVolumesSAS> volumesSASSetter) {
        if (this.volumesSAS == null) {
            this.volumesSAS = new QuotaDetailVolumesSAS();
            volumesSASSetter.accept(this.volumesSAS);
        }

        return this;
    }

    public QuotaDetailVolumesSAS getVolumesSAS() {
        return volumesSAS;
    }

    public void setVolumesSAS(QuotaDetailVolumesSAS volumesSAS) {
        this.volumesSAS = volumesSAS;
    }

    public QuotaList withGigabytesSSD(QuotaDetailGigabytesSSD gigabytesSSD) {
        this.gigabytesSSD = gigabytesSSD;
        return this;
    }

    public QuotaList withGigabytesSSD(Consumer<QuotaDetailGigabytesSSD> gigabytesSSDSetter) {
        if (this.gigabytesSSD == null) {
            this.gigabytesSSD = new QuotaDetailGigabytesSSD();
            gigabytesSSDSetter.accept(this.gigabytesSSD);
        }

        return this;
    }

    public QuotaDetailGigabytesSSD getGigabytesSSD() {
        return gigabytesSSD;
    }

    public void setGigabytesSSD(QuotaDetailGigabytesSSD gigabytesSSD) {
        this.gigabytesSSD = gigabytesSSD;
    }

    public QuotaList withSnapshotsSSD(QuotaDetailSnapshotsSSD snapshotsSSD) {
        this.snapshotsSSD = snapshotsSSD;
        return this;
    }

    public QuotaList withSnapshotsSSD(Consumer<QuotaDetailSnapshotsSSD> snapshotsSSDSetter) {
        if (this.snapshotsSSD == null) {
            this.snapshotsSSD = new QuotaDetailSnapshotsSSD();
            snapshotsSSDSetter.accept(this.snapshotsSSD);
        }

        return this;
    }

    public QuotaDetailSnapshotsSSD getSnapshotsSSD() {
        return snapshotsSSD;
    }

    public void setSnapshotsSSD(QuotaDetailSnapshotsSSD snapshotsSSD) {
        this.snapshotsSSD = snapshotsSSD;
    }

    public QuotaList withVolumesSSD(QuotaDetailVolumesSSD volumesSSD) {
        this.volumesSSD = volumesSSD;
        return this;
    }

    public QuotaList withVolumesSSD(Consumer<QuotaDetailVolumesSSD> volumesSSDSetter) {
        if (this.volumesSSD == null) {
            this.volumesSSD = new QuotaDetailVolumesSSD();
            volumesSSDSetter.accept(this.volumesSSD);
        }

        return this;
    }

    public QuotaDetailVolumesSSD getVolumesSSD() {
        return volumesSSD;
    }

    public void setVolumesSSD(QuotaDetailVolumesSSD volumesSSD) {
        this.volumesSSD = volumesSSD;
    }

    public QuotaList withGigabytesGPSSD(QuotaDetailGigabytesGPSSD gigabytesGPSSD) {
        this.gigabytesGPSSD = gigabytesGPSSD;
        return this;
    }

    public QuotaList withGigabytesGPSSD(Consumer<QuotaDetailGigabytesGPSSD> gigabytesGPSSDSetter) {
        if (this.gigabytesGPSSD == null) {
            this.gigabytesGPSSD = new QuotaDetailGigabytesGPSSD();
            gigabytesGPSSDSetter.accept(this.gigabytesGPSSD);
        }

        return this;
    }

    public QuotaDetailGigabytesGPSSD getGigabytesGPSSD() {
        return gigabytesGPSSD;
    }

    public void setGigabytesGPSSD(QuotaDetailGigabytesGPSSD gigabytesGPSSD) {
        this.gigabytesGPSSD = gigabytesGPSSD;
    }

    public QuotaList withSnapshotsGPSSD(QuotaDetailSnapshotsGPSSD snapshotsGPSSD) {
        this.snapshotsGPSSD = snapshotsGPSSD;
        return this;
    }

    public QuotaList withSnapshotsGPSSD(Consumer<QuotaDetailSnapshotsGPSSD> snapshotsGPSSDSetter) {
        if (this.snapshotsGPSSD == null) {
            this.snapshotsGPSSD = new QuotaDetailSnapshotsGPSSD();
            snapshotsGPSSDSetter.accept(this.snapshotsGPSSD);
        }

        return this;
    }

    public QuotaDetailSnapshotsGPSSD getSnapshotsGPSSD() {
        return snapshotsGPSSD;
    }

    public void setSnapshotsGPSSD(QuotaDetailSnapshotsGPSSD snapshotsGPSSD) {
        this.snapshotsGPSSD = snapshotsGPSSD;
    }

    public QuotaList withVolumesGPSSD(QuotaDetailVolumesGPSSD volumesGPSSD) {
        this.volumesGPSSD = volumesGPSSD;
        return this;
    }

    public QuotaList withVolumesGPSSD(Consumer<QuotaDetailVolumesGPSSD> volumesGPSSDSetter) {
        if (this.volumesGPSSD == null) {
            this.volumesGPSSD = new QuotaDetailVolumesGPSSD();
            volumesGPSSDSetter.accept(this.volumesGPSSD);
        }

        return this;
    }

    public QuotaDetailVolumesGPSSD getVolumesGPSSD() {
        return volumesGPSSD;
    }

    public void setVolumesGPSSD(QuotaDetailVolumesGPSSD volumesGPSSD) {
        this.volumesGPSSD = volumesGPSSD;
    }

    public QuotaList withPerVolumeGigabytes(QuotaDetailPerVolumeGigabytes perVolumeGigabytes) {
        this.perVolumeGigabytes = perVolumeGigabytes;
        return this;
    }

    public QuotaList withPerVolumeGigabytes(Consumer<QuotaDetailPerVolumeGigabytes> perVolumeGigabytesSetter) {
        if (this.perVolumeGigabytes == null) {
            this.perVolumeGigabytes = new QuotaDetailPerVolumeGigabytes();
            perVolumeGigabytesSetter.accept(this.perVolumeGigabytes);
        }

        return this;
    }

    public QuotaDetailPerVolumeGigabytes getPerVolumeGigabytes() {
        return perVolumeGigabytes;
    }

    public void setPerVolumeGigabytes(QuotaDetailPerVolumeGigabytes perVolumeGigabytes) {
        this.perVolumeGigabytes = perVolumeGigabytes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaList quotaList = (QuotaList) o;
        return Objects.equals(this.backupGigabytes, quotaList.backupGigabytes)
            && Objects.equals(this.backups, quotaList.backups) && Objects.equals(this.gigabytes, quotaList.gigabytes)
            && Objects.equals(this.id, quotaList.id) && Objects.equals(this.snapshots, quotaList.snapshots)
            && Objects.equals(this.volumes, quotaList.volumes)
            && Objects.equals(this.gigabytesSATA, quotaList.gigabytesSATA)
            && Objects.equals(this.snapshotsSATA, quotaList.snapshotsSATA)
            && Objects.equals(this.volumesSATA, quotaList.volumesSATA)
            && Objects.equals(this.gigabytesSAS, quotaList.gigabytesSAS)
            && Objects.equals(this.snapshotsSAS, quotaList.snapshotsSAS)
            && Objects.equals(this.volumesSAS, quotaList.volumesSAS)
            && Objects.equals(this.gigabytesSSD, quotaList.gigabytesSSD)
            && Objects.equals(this.snapshotsSSD, quotaList.snapshotsSSD)
            && Objects.equals(this.volumesSSD, quotaList.volumesSSD)
            && Objects.equals(this.gigabytesGPSSD, quotaList.gigabytesGPSSD)
            && Objects.equals(this.snapshotsGPSSD, quotaList.snapshotsGPSSD)
            && Objects.equals(this.volumesGPSSD, quotaList.volumesGPSSD)
            && Objects.equals(this.perVolumeGigabytes, quotaList.perVolumeGigabytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupGigabytes,
            backups,
            gigabytes,
            id,
            snapshots,
            volumes,
            gigabytesSATA,
            snapshotsSATA,
            volumesSATA,
            gigabytesSAS,
            snapshotsSAS,
            volumesSAS,
            gigabytesSSD,
            snapshotsSSD,
            volumesSSD,
            gigabytesGPSSD,
            snapshotsGPSSD,
            volumesGPSSD,
            perVolumeGigabytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaList {\n");
        sb.append("    backupGigabytes: ").append(toIndentedString(backupGigabytes)).append("\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    gigabytes: ").append(toIndentedString(gigabytes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    gigabytesSATA: ").append(toIndentedString(gigabytesSATA)).append("\n");
        sb.append("    snapshotsSATA: ").append(toIndentedString(snapshotsSATA)).append("\n");
        sb.append("    volumesSATA: ").append(toIndentedString(volumesSATA)).append("\n");
        sb.append("    gigabytesSAS: ").append(toIndentedString(gigabytesSAS)).append("\n");
        sb.append("    snapshotsSAS: ").append(toIndentedString(snapshotsSAS)).append("\n");
        sb.append("    volumesSAS: ").append(toIndentedString(volumesSAS)).append("\n");
        sb.append("    gigabytesSSD: ").append(toIndentedString(gigabytesSSD)).append("\n");
        sb.append("    snapshotsSSD: ").append(toIndentedString(snapshotsSSD)).append("\n");
        sb.append("    volumesSSD: ").append(toIndentedString(volumesSSD)).append("\n");
        sb.append("    gigabytesGPSSD: ").append(toIndentedString(gigabytesGPSSD)).append("\n");
        sb.append("    snapshotsGPSSD: ").append(toIndentedString(snapshotsGPSSD)).append("\n");
        sb.append("    volumesGPSSD: ").append(toIndentedString(volumesGPSSD)).append("\n");
        sb.append("    perVolumeGigabytes: ").append(toIndentedString(perVolumeGigabytes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
