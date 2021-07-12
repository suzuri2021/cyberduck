/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.brick.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * List Bandwidth Snapshots
 */
@Schema(description = "List Bandwidth Snapshots")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-12T12:23:43.971535+02:00[Europe/Paris]")
public class BandwidthSnapshotEntity {
  @JsonProperty("bytes_received")
  private Double bytesReceived = null;

  @JsonProperty("bytes_sent")
  private Double bytesSent = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("logged_at")
  private DateTime loggedAt = null;

  @JsonProperty("requests_get")
  private Double requestsGet = null;

  @JsonProperty("requests_other")
  private Double requestsOther = null;

  @JsonProperty("requests_put")
  private Double requestsPut = null;

  @JsonProperty("sync_bytes_received")
  private Double syncBytesReceived = null;

  @JsonProperty("sync_bytes_sent")
  private Double syncBytesSent = null;

  @JsonProperty("updated_at")
  private DateTime updatedAt = null;

  public BandwidthSnapshotEntity bytesReceived(Double bytesReceived) {
    this.bytesReceived = bytesReceived;
    return this;
  }

   /**
   * Site bandwidth report bytes received
   * @return bytesReceived
  **/
  @Schema(example = "1", description = "Site bandwidth report bytes received")
  public Double getBytesReceived() {
    return bytesReceived;
  }

  public void setBytesReceived(Double bytesReceived) {
    this.bytesReceived = bytesReceived;
  }

  public BandwidthSnapshotEntity bytesSent(Double bytesSent) {
    this.bytesSent = bytesSent;
    return this;
  }

   /**
   * Site bandwidth report bytes sent
   * @return bytesSent
  **/
  @Schema(example = "1", description = "Site bandwidth report bytes sent")
  public Double getBytesSent() {
    return bytesSent;
  }

  public void setBytesSent(Double bytesSent) {
    this.bytesSent = bytesSent;
  }

  public BandwidthSnapshotEntity createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Site bandwidth report created at date/time
   * @return createdAt
  **/
  @Schema(example = "2000-01-01T01:00Z", description = "Site bandwidth report created at date/time")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BandwidthSnapshotEntity id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Site bandwidth ID
   * @return id
  **/
  @Schema(example = "1", description = "Site bandwidth ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BandwidthSnapshotEntity loggedAt(DateTime loggedAt) {
    this.loggedAt = loggedAt;
    return this;
  }

   /**
   * Time the site bandwidth report was logged
   * @return loggedAt
  **/
  @Schema(example = "2000-01-01T01:00Z", description = "Time the site bandwidth report was logged")
  public DateTime getLoggedAt() {
    return loggedAt;
  }

  public void setLoggedAt(DateTime loggedAt) {
    this.loggedAt = loggedAt;
  }

  public BandwidthSnapshotEntity requestsGet(Double requestsGet) {
    this.requestsGet = requestsGet;
    return this;
  }

   /**
   * Site bandwidth report get requests
   * @return requestsGet
  **/
  @Schema(example = "1", description = "Site bandwidth report get requests")
  public Double getRequestsGet() {
    return requestsGet;
  }

  public void setRequestsGet(Double requestsGet) {
    this.requestsGet = requestsGet;
  }

  public BandwidthSnapshotEntity requestsOther(Double requestsOther) {
    this.requestsOther = requestsOther;
    return this;
  }

   /**
   * Site bandwidth report other requests
   * @return requestsOther
  **/
  @Schema(example = "1", description = "Site bandwidth report other requests")
  public Double getRequestsOther() {
    return requestsOther;
  }

  public void setRequestsOther(Double requestsOther) {
    this.requestsOther = requestsOther;
  }

  public BandwidthSnapshotEntity requestsPut(Double requestsPut) {
    this.requestsPut = requestsPut;
    return this;
  }

   /**
   * Site bandwidth report put requests
   * @return requestsPut
  **/
  @Schema(example = "1", description = "Site bandwidth report put requests")
  public Double getRequestsPut() {
    return requestsPut;
  }

  public void setRequestsPut(Double requestsPut) {
    this.requestsPut = requestsPut;
  }

  public BandwidthSnapshotEntity syncBytesReceived(Double syncBytesReceived) {
    this.syncBytesReceived = syncBytesReceived;
    return this;
  }

   /**
   * Site sync bandwidth report bytes received
   * @return syncBytesReceived
  **/
  @Schema(example = "1", description = "Site sync bandwidth report bytes received")
  public Double getSyncBytesReceived() {
    return syncBytesReceived;
  }

  public void setSyncBytesReceived(Double syncBytesReceived) {
    this.syncBytesReceived = syncBytesReceived;
  }

  public BandwidthSnapshotEntity syncBytesSent(Double syncBytesSent) {
    this.syncBytesSent = syncBytesSent;
    return this;
  }

   /**
   * Site sync bandwidth report bytes sent
   * @return syncBytesSent
  **/
  @Schema(example = "1", description = "Site sync bandwidth report bytes sent")
  public Double getSyncBytesSent() {
    return syncBytesSent;
  }

  public void setSyncBytesSent(Double syncBytesSent) {
    this.syncBytesSent = syncBytesSent;
  }

  public BandwidthSnapshotEntity updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The last time this site bandwidth report was updated
   * @return updatedAt
  **/
  @Schema(example = "2000-01-01T01:00Z", description = "The last time this site bandwidth report was updated")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthSnapshotEntity bandwidthSnapshotEntity = (BandwidthSnapshotEntity) o;
    return Objects.equals(this.bytesReceived, bandwidthSnapshotEntity.bytesReceived) &&
        Objects.equals(this.bytesSent, bandwidthSnapshotEntity.bytesSent) &&
        Objects.equals(this.createdAt, bandwidthSnapshotEntity.createdAt) &&
        Objects.equals(this.id, bandwidthSnapshotEntity.id) &&
        Objects.equals(this.loggedAt, bandwidthSnapshotEntity.loggedAt) &&
        Objects.equals(this.requestsGet, bandwidthSnapshotEntity.requestsGet) &&
        Objects.equals(this.requestsOther, bandwidthSnapshotEntity.requestsOther) &&
        Objects.equals(this.requestsPut, bandwidthSnapshotEntity.requestsPut) &&
        Objects.equals(this.syncBytesReceived, bandwidthSnapshotEntity.syncBytesReceived) &&
        Objects.equals(this.syncBytesSent, bandwidthSnapshotEntity.syncBytesSent) &&
        Objects.equals(this.updatedAt, bandwidthSnapshotEntity.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesReceived, bytesSent, createdAt, id, loggedAt, requestsGet, requestsOther, requestsPut, syncBytesReceived, syncBytesSent, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthSnapshotEntity {\n");
    
    sb.append("    bytesReceived: ").append(toIndentedString(bytesReceived)).append("\n");
    sb.append("    bytesSent: ").append(toIndentedString(bytesSent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loggedAt: ").append(toIndentedString(loggedAt)).append("\n");
    sb.append("    requestsGet: ").append(toIndentedString(requestsGet)).append("\n");
    sb.append("    requestsOther: ").append(toIndentedString(requestsOther)).append("\n");
    sb.append("    requestsPut: ").append(toIndentedString(requestsPut)).append("\n");
    sb.append("    syncBytesReceived: ").append(toIndentedString(syncBytesReceived)).append("\n");
    sb.append("    syncBytesSent: ").append(toIndentedString(syncBytesSent)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
