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
import Model.ReportingV3ConversionDetailsGet200ResponseNotes;
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
import org.joda.time.DateTime;

/**
 * ReportingV3ConversionDetailsGet200ResponseConversionDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class ReportingV3ConversionDetailsGet200ResponseConversionDetails {
  @SerializedName("merchantReferenceNumber")
  private String merchantReferenceNumber = null;

  @SerializedName("conversionTime")
  private DateTime conversionTime = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("originalDecision")
  private String originalDecision = null;

  @SerializedName("newDecision")
  private String newDecision = null;

  @SerializedName("reviewer")
  private String reviewer = null;

  @SerializedName("reviewerComments")
  private String reviewerComments = null;

  @SerializedName("queue")
  private String queue = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("notes")
  private List<ReportingV3ConversionDetailsGet200ResponseNotes> notes = null;

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails merchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
    return this;
  }

   /**
   * Merchant reference number of a merchant
   * @return merchantReferenceNumber
  **/
  @ApiModelProperty(example = "1234567890", value = "Merchant reference number of a merchant")
  public String getMerchantReferenceNumber() {
    return merchantReferenceNumber;
  }

  public void setMerchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails conversionTime(DateTime conversionTime) {
    this.conversionTime = conversionTime;
    return this;
  }

   /**
   * Date of conversion
   * @return conversionTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Date of conversion")
  public DateTime getConversionTime() {
    return conversionTime;
  }

  public void setConversionTime(DateTime conversionTime) {
    this.conversionTime = conversionTime;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Cybersource Transation request id
   * @return requestId
  **/
  @ApiModelProperty(example = "1234567890123456789012", value = "Cybersource Transation request id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails originalDecision(String originalDecision) {
    this.originalDecision = originalDecision;
    return this;
  }

   /**
   * Original decision
   * @return originalDecision
  **/
  @ApiModelProperty(example = "REVIEW", value = "Original decision")
  public String getOriginalDecision() {
    return originalDecision;
  }

  public void setOriginalDecision(String originalDecision) {
    this.originalDecision = originalDecision;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails newDecision(String newDecision) {
    this.newDecision = newDecision;
    return this;
  }

   /**
   * New decision
   * @return newDecision
  **/
  @ApiModelProperty(example = "ACCEPT", value = "New decision")
  public String getNewDecision() {
    return newDecision;
  }

  public void setNewDecision(String newDecision) {
    this.newDecision = newDecision;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails reviewer(String reviewer) {
    this.reviewer = reviewer;
    return this;
  }

   /**
   * User name of the reviewer
   * @return reviewer
  **/
  @ApiModelProperty(example = "testuserId", value = "User name of the reviewer")
  public String getReviewer() {
    return reviewer;
  }

  public void setReviewer(String reviewer) {
    this.reviewer = reviewer;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails reviewerComments(String reviewerComments) {
    this.reviewerComments = reviewerComments;
    return this;
  }

   /**
   * Comments of the reviewer
   * @return reviewerComments
  **/
  @ApiModelProperty(example = "Verified order.", value = "Comments of the reviewer")
  public String getReviewerComments() {
    return reviewerComments;
  }

  public void setReviewerComments(String reviewerComments) {
    this.reviewerComments = reviewerComments;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * Name of the queue
   * @return queue
  **/
  @ApiModelProperty(example = "Review Queue", value = "Name of the queue")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Name of the profile
   * @return profile
  **/
  @ApiModelProperty(example = "Test Profile", value = "Name of the profile")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails notes(List<ReportingV3ConversionDetailsGet200ResponseNotes> notes) {
    this.notes = notes;
    return this;
  }

  public ReportingV3ConversionDetailsGet200ResponseConversionDetails addNotesItem(ReportingV3ConversionDetailsGet200ResponseNotes notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<ReportingV3ConversionDetailsGet200ResponseNotes>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3ConversionDetailsGet200ResponseNotes> getNotes() {
    return notes;
  }

  public void setNotes(List<ReportingV3ConversionDetailsGet200ResponseNotes> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ConversionDetailsGet200ResponseConversionDetails reportingV3ConversionDetailsGet200ResponseConversionDetails = (ReportingV3ConversionDetailsGet200ResponseConversionDetails) o;
    return Objects.equals(this.merchantReferenceNumber, reportingV3ConversionDetailsGet200ResponseConversionDetails.merchantReferenceNumber) &&
        Objects.equals(this.conversionTime, reportingV3ConversionDetailsGet200ResponseConversionDetails.conversionTime) &&
        Objects.equals(this.requestId, reportingV3ConversionDetailsGet200ResponseConversionDetails.requestId) &&
        Objects.equals(this.originalDecision, reportingV3ConversionDetailsGet200ResponseConversionDetails.originalDecision) &&
        Objects.equals(this.newDecision, reportingV3ConversionDetailsGet200ResponseConversionDetails.newDecision) &&
        Objects.equals(this.reviewer, reportingV3ConversionDetailsGet200ResponseConversionDetails.reviewer) &&
        Objects.equals(this.reviewerComments, reportingV3ConversionDetailsGet200ResponseConversionDetails.reviewerComments) &&
        Objects.equals(this.queue, reportingV3ConversionDetailsGet200ResponseConversionDetails.queue) &&
        Objects.equals(this.profile, reportingV3ConversionDetailsGet200ResponseConversionDetails.profile) &&
        Objects.equals(this.notes, reportingV3ConversionDetailsGet200ResponseConversionDetails.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReferenceNumber, conversionTime, requestId, originalDecision, newDecision, reviewer, reviewerComments, queue, profile, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ConversionDetailsGet200ResponseConversionDetails {\n");
    
    sb.append("    merchantReferenceNumber: ").append(toIndentedString(merchantReferenceNumber)).append("\n");
    sb.append("    conversionTime: ").append(toIndentedString(conversionTime)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    originalDecision: ").append(toIndentedString(originalDecision)).append("\n");
    sb.append("    newDecision: ").append(toIndentedString(newDecision)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    reviewerComments: ").append(toIndentedString(reviewerComments)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

