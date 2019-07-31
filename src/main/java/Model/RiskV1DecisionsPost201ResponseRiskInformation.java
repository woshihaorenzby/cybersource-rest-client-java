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
import Model.RiskV1DecisionsPost201ResponseRiskInformationInfoCodes;
import Model.RiskV1DecisionsPost201ResponseRiskInformationIpAddress;
import Model.RiskV1DecisionsPost201ResponseRiskInformationProfile;
import Model.RiskV1DecisionsPost201ResponseRiskInformationProviders;
import Model.RiskV1DecisionsPost201ResponseRiskInformationRules;
import Model.RiskV1DecisionsPost201ResponseRiskInformationScore;
import Model.RiskV1DecisionsPost201ResponseRiskInformationTravel;
import Model.RiskV1DecisionsPost201ResponseRiskInformationVelocity;
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
 * Contains the result of risk assessment.
 */
@ApiModel(description = "Contains the result of risk assessment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformation {
  @SerializedName("profile")
  private RiskV1DecisionsPost201ResponseRiskInformationProfile profile = null;

  @SerializedName("rules")
  private List<RiskV1DecisionsPost201ResponseRiskInformationRules> rules = null;

  @SerializedName("infoCodes")
  private RiskV1DecisionsPost201ResponseRiskInformationInfoCodes infoCodes = null;

  @SerializedName("velocity")
  private RiskV1DecisionsPost201ResponseRiskInformationVelocity velocity = null;

  @SerializedName("casePriority")
  private Integer casePriority = null;

  @SerializedName("localTime")
  private String localTime = null;

  @SerializedName("score")
  private RiskV1DecisionsPost201ResponseRiskInformationScore score = null;

  @SerializedName("ipAddress")
  private RiskV1DecisionsPost201ResponseRiskInformationIpAddress ipAddress = null;

  @SerializedName("providers")
  private RiskV1DecisionsPost201ResponseRiskInformationProviders providers = null;

  @SerializedName("travel")
  private RiskV1DecisionsPost201ResponseRiskInformationTravel travel = null;

  public RiskV1DecisionsPost201ResponseRiskInformation profile(RiskV1DecisionsPost201ResponseRiskInformationProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationProfile getProfile() {
    return profile;
  }

  public void setProfile(RiskV1DecisionsPost201ResponseRiskInformationProfile profile) {
    this.profile = profile;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation rules(List<RiskV1DecisionsPost201ResponseRiskInformationRules> rules) {
    this.rules = rules;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation addRulesItem(RiskV1DecisionsPost201ResponseRiskInformationRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RiskV1DecisionsPost201ResponseRiskInformationRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<RiskV1DecisionsPost201ResponseRiskInformationRules> getRules() {
    return rules;
  }

  public void setRules(List<RiskV1DecisionsPost201ResponseRiskInformationRules> rules) {
    this.rules = rules;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation infoCodes(RiskV1DecisionsPost201ResponseRiskInformationInfoCodes infoCodes) {
    this.infoCodes = infoCodes;
    return this;
  }

   /**
   * Get infoCodes
   * @return infoCodes
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes getInfoCodes() {
    return infoCodes;
  }

  public void setInfoCodes(RiskV1DecisionsPost201ResponseRiskInformationInfoCodes infoCodes) {
    this.infoCodes = infoCodes;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation velocity(RiskV1DecisionsPost201ResponseRiskInformationVelocity velocity) {
    this.velocity = velocity;
    return this;
  }

   /**
   * Get velocity
   * @return velocity
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationVelocity getVelocity() {
    return velocity;
  }

  public void setVelocity(RiskV1DecisionsPost201ResponseRiskInformationVelocity velocity) {
    this.velocity = velocity;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation casePriority(Integer casePriority) {
    this.casePriority = casePriority;
    return this;
  }

   /**
   * You receive this field only if you subscribe to the Enhanced Case Management service. The priority level ranges from 1 (highest) to 5 (lowest); the default value is 3. If you do not assign a priority to your rules or to your profiles, the default value is given to the order.  For all possible values, see the &#x60;decision_case_priority&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return casePriority
  **/
  @ApiModelProperty(value = "You receive this field only if you subscribe to the Enhanced Case Management service. The priority level ranges from 1 (highest) to 5 (lowest); the default value is 3. If you do not assign a priority to your rules or to your profiles, the default value is given to the order.  For all possible values, see the `decision_case_priority` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public Integer getCasePriority() {
    return casePriority;
  }

  public void setCasePriority(Integer casePriority) {
    this.casePriority = casePriority;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation localTime(String localTime) {
    this.localTime = localTime;
    return this;
  }

   /**
   * The customer&#39;s local time (&#x60;hh:mm:ss&#x60;), which is calculated from the transaction request time and the customer&#39;s billing address.  For details, see the &#x60;score_time_local&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) 
   * @return localTime
  **/
  @ApiModelProperty(value = "The customer's local time (`hh:mm:ss`), which is calculated from the transaction request time and the customer's billing address.  For details, see the `score_time_local` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) ")
  public String getLocalTime() {
    return localTime;
  }

  public void setLocalTime(String localTime) {
    this.localTime = localTime;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation score(RiskV1DecisionsPost201ResponseRiskInformationScore score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationScore getScore() {
    return score;
  }

  public void setScore(RiskV1DecisionsPost201ResponseRiskInformationScore score) {
    this.score = score;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation ipAddress(RiskV1DecisionsPost201ResponseRiskInformationIpAddress ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationIpAddress getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(RiskV1DecisionsPost201ResponseRiskInformationIpAddress ipAddress) {
    this.ipAddress = ipAddress;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation providers(RiskV1DecisionsPost201ResponseRiskInformationProviders providers) {
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationProviders getProviders() {
    return providers;
  }

  public void setProviders(RiskV1DecisionsPost201ResponseRiskInformationProviders providers) {
    this.providers = providers;
  }

  public RiskV1DecisionsPost201ResponseRiskInformation travel(RiskV1DecisionsPost201ResponseRiskInformationTravel travel) {
    this.travel = travel;
    return this;
  }

   /**
   * Get travel
   * @return travel
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationTravel getTravel() {
    return travel;
  }

  public void setTravel(RiskV1DecisionsPost201ResponseRiskInformationTravel travel) {
    this.travel = travel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformation riskV1DecisionsPost201ResponseRiskInformation = (RiskV1DecisionsPost201ResponseRiskInformation) o;
    return Objects.equals(this.profile, riskV1DecisionsPost201ResponseRiskInformation.profile) &&
        Objects.equals(this.rules, riskV1DecisionsPost201ResponseRiskInformation.rules) &&
        Objects.equals(this.infoCodes, riskV1DecisionsPost201ResponseRiskInformation.infoCodes) &&
        Objects.equals(this.velocity, riskV1DecisionsPost201ResponseRiskInformation.velocity) &&
        Objects.equals(this.casePriority, riskV1DecisionsPost201ResponseRiskInformation.casePriority) &&
        Objects.equals(this.localTime, riskV1DecisionsPost201ResponseRiskInformation.localTime) &&
        Objects.equals(this.score, riskV1DecisionsPost201ResponseRiskInformation.score) &&
        Objects.equals(this.ipAddress, riskV1DecisionsPost201ResponseRiskInformation.ipAddress) &&
        Objects.equals(this.providers, riskV1DecisionsPost201ResponseRiskInformation.providers) &&
        Objects.equals(this.travel, riskV1DecisionsPost201ResponseRiskInformation.travel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, rules, infoCodes, velocity, casePriority, localTime, score, ipAddress, providers, travel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformation {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    infoCodes: ").append(toIndentedString(infoCodes)).append("\n");
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    casePriority: ").append(toIndentedString(casePriority)).append("\n");
    sb.append("    localTime: ").append(toIndentedString(localTime)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
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
