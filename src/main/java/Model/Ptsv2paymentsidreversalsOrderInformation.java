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
import Model.Ptsv2paymentsidreversalsOrderInformationAmountDetails;
import Model.Ptsv2paymentsidreversalsOrderInformationLineItems;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsidreversalsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class Ptsv2paymentsidreversalsOrderInformation {
  @SerializedName("amountDetails")
  private Ptsv2paymentsidreversalsOrderInformationAmountDetails amountDetails = null;

  @SerializedName("lineItems")
  private List<Ptsv2paymentsidreversalsOrderInformationLineItems> lineItems = null;

  public Ptsv2paymentsidreversalsOrderInformation amountDetails(Ptsv2paymentsidreversalsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsidreversalsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv2paymentsidreversalsOrderInformation lineItems(List<Ptsv2paymentsidreversalsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Ptsv2paymentsidreversalsOrderInformation addLineItemsItem(Ptsv2paymentsidreversalsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Ptsv2paymentsidreversalsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsidreversalsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Ptsv2paymentsidreversalsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsOrderInformation ptsv2paymentsidreversalsOrderInformation = (Ptsv2paymentsidreversalsOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsv2paymentsidreversalsOrderInformation.amountDetails) &&
        Objects.equals(this.lineItems, ptsv2paymentsidreversalsOrderInformation.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

