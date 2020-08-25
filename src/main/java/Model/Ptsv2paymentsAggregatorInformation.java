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
import Model.Ptsv2paymentsAggregatorInformationSubMerchant;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsAggregatorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Ptsv2paymentsAggregatorInformation {
  @SerializedName("aggregatorId")
  private String aggregatorId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subMerchant")
  private Ptsv2paymentsAggregatorInformationSubMerchant subMerchant = null;

  public Ptsv2paymentsAggregatorInformation aggregatorId(String aggregatorId) {
    this.aggregatorId = aggregatorId;
    return this;
  }

   /**
   * Value that identifies you as a payment aggregator. Get this value from the processor.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR6 - Position: 95-105 - Field: MasterCard Payment Facilitator ID  **FDC Compass**\\ This value must consist of uppercase characters.  For processor-specific information, see the &#x60;aggregator_id&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return aggregatorId
  **/
  @ApiModelProperty(value = "Value that identifies you as a payment aggregator. Get this value from the processor.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR6 - Position: 95-105 - Field: MasterCard Payment Facilitator ID  **FDC Compass**\\ This value must consist of uppercase characters.  For processor-specific information, see the `aggregator_id` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAggregatorId() {
    return aggregatorId;
  }

  public void setAggregatorId(String aggregatorId) {
    this.aggregatorId = aggregatorId;
  }

  public Ptsv2paymentsAggregatorInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your payment aggregator business name.  **American Express Direct**\\ The maximum length of the aggregator name depends on the length of the sub-merchant name. The combined length for both values must not exceed 36 characters.\\  #### CyberSource through VisaNet With American Express, the maximum length of the aggregator name depends on the length of the sub-merchant name. The combined length for both values must not exceed 36 characters. The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters.  For processor-specific information, see the aggregator_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return name
  **/
  @ApiModelProperty(value = "Your payment aggregator business name.  **American Express Direct**\\ The maximum length of the aggregator name depends on the length of the sub-merchant name. The combined length for both values must not exceed 36 characters.\\  #### CyberSource through VisaNet With American Express, the maximum length of the aggregator name depends on the length of the sub-merchant name. The combined length for both values must not exceed 36 characters. The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters.  For processor-specific information, see the aggregator_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsAggregatorInformation subMerchant(Ptsv2paymentsAggregatorInformationSubMerchant subMerchant) {
    this.subMerchant = subMerchant;
    return this;
  }

   /**
   * Get subMerchant
   * @return subMerchant
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsAggregatorInformationSubMerchant getSubMerchant() {
    return subMerchant;
  }

  public void setSubMerchant(Ptsv2paymentsAggregatorInformationSubMerchant subMerchant) {
    this.subMerchant = subMerchant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsAggregatorInformation ptsv2paymentsAggregatorInformation = (Ptsv2paymentsAggregatorInformation) o;
    return Objects.equals(this.aggregatorId, ptsv2paymentsAggregatorInformation.aggregatorId) &&
        Objects.equals(this.name, ptsv2paymentsAggregatorInformation.name) &&
        Objects.equals(this.subMerchant, ptsv2paymentsAggregatorInformation.subMerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatorId, name, subMerchant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsAggregatorInformation {\n");
    
    sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subMerchant: ").append(toIndentedString(subMerchant)).append("\n");
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

