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
import Model.Tmsv2customersLinksPaymentInstruments;
import Model.Tmsv2customersLinksSelf;
import Model.Tmsv2customersLinksShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2customersLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Tmsv2customersLinks {
  @SerializedName("self")
  private Tmsv2customersLinksSelf self = null;

  @SerializedName("paymentInstruments")
  private Tmsv2customersLinksPaymentInstruments paymentInstruments = null;

  @SerializedName("shippingAddress")
  private Tmsv2customersLinksShippingAddress shippingAddress = null;

  public Tmsv2customersLinks self(Tmsv2customersLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersLinksSelf getSelf() {
    return self;
  }

  public void setSelf(Tmsv2customersLinksSelf self) {
    this.self = self;
  }

  public Tmsv2customersLinks paymentInstruments(Tmsv2customersLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersLinksPaymentInstruments getPaymentInstruments() {
    return paymentInstruments;
  }

  public void setPaymentInstruments(Tmsv2customersLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }

  public Tmsv2customersLinks shippingAddress(Tmsv2customersLinksShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersLinksShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Tmsv2customersLinksShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersLinks tmsv2customersLinks = (Tmsv2customersLinks) o;
    return Objects.equals(this.self, tmsv2customersLinks.self) &&
        Objects.equals(this.paymentInstruments, tmsv2customersLinks.paymentInstruments) &&
        Objects.equals(this.shippingAddress, tmsv2customersLinks.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, paymentInstruments, shippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

