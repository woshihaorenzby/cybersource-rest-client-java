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
import Model.Ptsv2paymentsidreversalsReversalInformationAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidreversalsReversalInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Ptsv2paymentsidreversalsReversalInformation {
  @SerializedName("amountDetails")
  private Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails = null;

  @SerializedName("reason")
  private String reason = null;

  public Ptsv2paymentsidreversalsReversalInformation amountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsReversalInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv2paymentsidreversalsReversalInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for the authorization reversal. Possible value:   - &#x60;34&#x60;: Suspected fraud  This field is ignored for processors that do not support this value.  Returned by authorization reversal. 
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the authorization reversal. Possible value:   - `34`: Suspected fraud  This field is ignored for processors that do not support this value.  Returned by authorization reversal. ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsReversalInformation ptsv2paymentsidreversalsReversalInformation = (Ptsv2paymentsidreversalsReversalInformation) o;
    return Objects.equals(this.amountDetails, ptsv2paymentsidreversalsReversalInformation.amountDetails) &&
        Objects.equals(this.reason, ptsv2paymentsidreversalsReversalInformation.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsReversalInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

