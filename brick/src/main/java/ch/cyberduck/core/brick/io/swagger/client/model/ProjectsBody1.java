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
 * ProjectsBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-12T10:20:43.848213+02:00[Europe/Paris]")
public class ProjectsBody1 {
  @JsonProperty("global_access")
  private String globalAccess = null;

  public ProjectsBody1 globalAccess(String globalAccess) {
    this.globalAccess = globalAccess;
    return this;
  }

   /**
   * Global permissions.  Can be: &#x60;none&#x60;, &#x60;anyone_with_read&#x60;, &#x60;anyone_with_full&#x60;.
   * @return globalAccess
  **/
  @Schema(required = true, description = "Global permissions.  Can be: `none`, `anyone_with_read`, `anyone_with_full`.")
  public String getGlobalAccess() {
    return globalAccess;
  }

  public void setGlobalAccess(String globalAccess) {
    this.globalAccess = globalAccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsBody1 projectsBody1 = (ProjectsBody1) o;
    return Objects.equals(this.globalAccess, projectsBody1.globalAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalAccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsBody1 {\n");
    
    sb.append("    globalAccess: ").append(toIndentedString(globalAccess)).append("\n");
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
