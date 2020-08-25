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
import Model.Riskv1decisionsidmarkingRiskInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FraudMarkingActionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class FraudMarkingActionRequest {
  @SerializedName("riskInformation")
  private Riskv1decisionsidmarkingRiskInformation riskInformation = null;

  public FraudMarkingActionRequest riskInformation(Riskv1decisionsidmarkingRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsidmarkingRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Riskv1decisionsidmarkingRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudMarkingActionRequest fraudMarkingActionRequest = (FraudMarkingActionRequest) o;
    return Objects.equals(this.riskInformation, fraudMarkingActionRequest.riskInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudMarkingActionRequest {\n");
    
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
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

