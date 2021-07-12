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
/**
 * RequestsBody2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-12T10:20:43.848213+02:00[Europe/Paris]")
public class RequestsBody2 {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("user_ids")
  private String userIds = null;

  @JsonProperty("group_ids")
  private String groupIds = null;

  public RequestsBody2 path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Folder path on which to request the file.
   * @return path
  **/
  @Schema(required = true, description = "Folder path on which to request the file.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RequestsBody2 destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Destination filename (without extension) to request.
   * @return destination
  **/
  @Schema(required = true, description = "Destination filename (without extension) to request.")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public RequestsBody2 userIds(String userIds) {
    this.userIds = userIds;
    return this;
  }

   /**
   * A list of user IDs to request the file from. If sent as a string, it should be comma-delimited.
   * @return userIds
  **/
  @Schema(description = "A list of user IDs to request the file from. If sent as a string, it should be comma-delimited.")
  public String getUserIds() {
    return userIds;
  }

  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

  public RequestsBody2 groupIds(String groupIds) {
    this.groupIds = groupIds;
    return this;
  }

   /**
   * A list of group IDs to request the file from. If sent as a string, it should be comma-delimited.
   * @return groupIds
  **/
  @Schema(description = "A list of group IDs to request the file from. If sent as a string, it should be comma-delimited.")
  public String getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(String groupIds) {
    this.groupIds = groupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestsBody2 requestsBody2 = (RequestsBody2) o;
    return Objects.equals(this.path, requestsBody2.path) &&
        Objects.equals(this.destination, requestsBody2.destination) &&
        Objects.equals(this.userIds, requestsBody2.userIds) &&
        Objects.equals(this.groupIds, requestsBody2.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, destination, userIds, groupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestsBody2 {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
