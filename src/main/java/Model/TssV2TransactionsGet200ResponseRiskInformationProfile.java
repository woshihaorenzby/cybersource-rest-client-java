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
 * TssV2TransactionsGet200ResponseRiskInformationProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class TssV2TransactionsGet200ResponseRiskInformationProfile {
  @SerializedName("name")
  private String name = null;

  @SerializedName("decision")
  private String decision = null;

  public TssV2TransactionsGet200ResponseRiskInformationProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the profile. 
   * @return name
  **/
  @ApiModelProperty(value = "The name of the profile. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponseRiskInformationProfile decision(String decision) {
    this.decision = decision;
    return this;
  }

   /**
   * Decision returned by the profile; this field contains one of these values: - ACCEPT - REJECT - REVIEW 
   * @return decision
  **/
  @ApiModelProperty(value = "Decision returned by the profile; this field contains one of these values: - ACCEPT - REJECT - REVIEW ")
  public String getDecision() {
    return decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseRiskInformationProfile tssV2TransactionsGet200ResponseRiskInformationProfile = (TssV2TransactionsGet200ResponseRiskInformationProfile) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponseRiskInformationProfile.name) &&
        Objects.equals(this.decision, tssV2TransactionsGet200ResponseRiskInformationProfile.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, decision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseRiskInformationProfile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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

