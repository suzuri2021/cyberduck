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
 * UserRequestsBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-12T10:20:43.848213+02:00[Europe/Paris]")
public class UserRequestsBody1 {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("details")
  private String details = null;

  public UserRequestsBody1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of user requested
   * @return name
  **/
  @Schema(required = true, description = "Name of user requested")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserRequestsBody1 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of user requested
   * @return email
  **/
  @Schema(required = true, description = "Email of user requested")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRequestsBody1 details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Details of the user request
   * @return details
  **/
  @Schema(required = true, description = "Details of the user request")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRequestsBody1 userRequestsBody1 = (UserRequestsBody1) o;
    return Objects.equals(this.name, userRequestsBody1.name) &&
        Objects.equals(this.email, userRequestsBody1.email) &&
        Objects.equals(this.details, userRequestsBody1.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequestsBody1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
