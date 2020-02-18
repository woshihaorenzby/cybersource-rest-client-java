/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.InlineResponseDefaultLinks;
import Model.InlineResponseDefaultResponseStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class ErrorResponse {
  @SerializedName("responseStatus")
  private InlineResponseDefaultResponseStatus responseStatus = null;

  @SerializedName("_links")
  private InlineResponseDefaultLinks links = null;

  public ErrorResponse responseStatus(InlineResponseDefaultResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @ApiModelProperty(value = "")
  public InlineResponseDefaultResponseStatus getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(InlineResponseDefaultResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  public ErrorResponse links(InlineResponseDefaultLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InlineResponseDefaultLinks getLinks() {
    return links;
  }

  public void setLinks(InlineResponseDefaultLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.responseStatus, errorResponse.responseStatus) &&
        Objects.equals(this.links, errorResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

