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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * MessageCommentsIdBody2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-11T22:23:45.902337+02:00[Europe/Paris]")
public class MessageCommentsIdBody2 {
  @JsonProperty("body")
  private String body = null;

  public MessageCommentsIdBody2 body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Comment body.
   * @return body
  **/
  @Schema(required = true, description = "Comment body.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageCommentsIdBody2 messageCommentsIdBody2 = (MessageCommentsIdBody2) o;
    return Objects.equals(this.body, messageCommentsIdBody2.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCommentsIdBody2 {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
