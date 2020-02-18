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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidcapturesPointOfSaleInformationEmv
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class Ptsv2paymentsidcapturesPointOfSaleInformationEmv {
  @SerializedName("tags")
  private String tags = null;

  @SerializedName("fallback")
  private Boolean fallback = false;

  public Ptsv2paymentsidcapturesPointOfSaleInformationEmv tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * EMV data that is transmitted from the chip card to the issuer, and from the issuer to the chip card. The EMV data is in the tag-length-value format and includes chip card tags, terminal tags, and transaction detail tags.  For details, see the &#x60;emv_request_combined_tags&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/)  **Note** The information about EMV applies to credit card processing and PIN debit processing. All other information in this guide applies only to credit card processing. PIN debit processing is available only on FDC Nashville Global.  **Note** For information about the individual tags, see the “Application Specification” section in the EMV 4.3 Specifications: http://emvco.com  **Important** The following tags contain sensitive information and **must not** be included in this field:   - **56**: Track 1 equivalent data  - **57**: Track 2 equivalent data  - **5A**: Application PAN  - **5F20**: Cardholder name  - **5F24**: Application expiration date (This sensitivity has been relaxed for cmcic, amexdirect, fdiglobal, opdfde, and six)  - **99**: Transaction PIN  - **9F0B**: Cardholder name (extended)  - **9F1F**: Track 1 discretionary data  - **9F20**: Track 2 discretionary data  For captures, this field is required for contact EMV transactions. Otherwise, it is optional.  For credits, this field is required for contact EMV stand-alone credits and contactless EMV stand-alone credits. Otherwise, it is optional.  **Important** For contact EMV captures, contact EMV stand-alone credits, and contactless EMV stand-alone credits, you must include the following tags in this field. For all other types of EMV transactions, the following tags are optional.   - **95**: Terminal verification results  - **9F10**: Issuer application data  - **9F26**: Application cryptogram 
   * @return tags
  **/
  @ApiModelProperty(value = "EMV data that is transmitted from the chip card to the issuer, and from the issuer to the chip card. The EMV data is in the tag-length-value format and includes chip card tags, terminal tags, and transaction detail tags.  For details, see the `emv_request_combined_tags` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/)  **Note** The information about EMV applies to credit card processing and PIN debit processing. All other information in this guide applies only to credit card processing. PIN debit processing is available only on FDC Nashville Global.  **Note** For information about the individual tags, see the “Application Specification” section in the EMV 4.3 Specifications: http://emvco.com  **Important** The following tags contain sensitive information and **must not** be included in this field:   - **56**: Track 1 equivalent data  - **57**: Track 2 equivalent data  - **5A**: Application PAN  - **5F20**: Cardholder name  - **5F24**: Application expiration date (This sensitivity has been relaxed for cmcic, amexdirect, fdiglobal, opdfde, and six)  - **99**: Transaction PIN  - **9F0B**: Cardholder name (extended)  - **9F1F**: Track 1 discretionary data  - **9F20**: Track 2 discretionary data  For captures, this field is required for contact EMV transactions. Otherwise, it is optional.  For credits, this field is required for contact EMV stand-alone credits and contactless EMV stand-alone credits. Otherwise, it is optional.  **Important** For contact EMV captures, contact EMV stand-alone credits, and contactless EMV stand-alone credits, you must include the following tags in this field. For all other types of EMV transactions, the following tags are optional.   - **95**: Terminal verification results  - **9F10**: Issuer application data  - **9F26**: Application cryptogram ")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Ptsv2paymentsidcapturesPointOfSaleInformationEmv fallback(Boolean fallback) {
    this.fallback = fallback;
    return this;
  }

   /**
   * Indicates whether a fallback method was used to enter credit card information into the POS terminal. When a technical problem prevents a successful exchange of information between a chip card and a chip-capable terminal:   1. Swipe the card or key the credit card information into the POS terminal.  2. Use the pointOfSaleInformation.entryMode field to indicate whether the information was swiped or keyed.  Possible values:  - **true**  - **false** (default)  This field is supported only on **Chase Paymentech Solutions** and **GPN**. 
   * @return fallback
  **/
  @ApiModelProperty(value = "Indicates whether a fallback method was used to enter credit card information into the POS terminal. When a technical problem prevents a successful exchange of information between a chip card and a chip-capable terminal:   1. Swipe the card or key the credit card information into the POS terminal.  2. Use the pointOfSaleInformation.entryMode field to indicate whether the information was swiped or keyed.  Possible values:  - **true**  - **false** (default)  This field is supported only on **Chase Paymentech Solutions** and **GPN**. ")
  public Boolean getFallback() {
    return fallback;
  }

  public void setFallback(Boolean fallback) {
    this.fallback = fallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidcapturesPointOfSaleInformationEmv ptsv2paymentsidcapturesPointOfSaleInformationEmv = (Ptsv2paymentsidcapturesPointOfSaleInformationEmv) o;
    return Objects.equals(this.tags, ptsv2paymentsidcapturesPointOfSaleInformationEmv.tags) &&
        Objects.equals(this.fallback, ptsv2paymentsidcapturesPointOfSaleInformationEmv.fallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, fallback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesPointOfSaleInformationEmv {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
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

