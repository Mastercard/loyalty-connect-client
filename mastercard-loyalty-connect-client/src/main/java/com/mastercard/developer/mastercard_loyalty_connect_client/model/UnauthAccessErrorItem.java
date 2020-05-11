/*
 * Mastercard Loyalty Connect Service
 * Rest Service for connecting payment cards with loyalty programs
 *
 * The version of the OpenAPI document: 1.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mastercard_loyalty_connect_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UnauthAccessErrorItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T11:15:32.100+05:30[Asia/Calcutta]")
public class UnauthAccessErrorItem {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_RECOVERABLE = "Recoverable";
  @SerializedName(SERIALIZED_NAME_RECOVERABLE)
  private Boolean recoverable;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;


  public UnauthAccessErrorItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unauthorized access to information", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UnauthAccessErrorItem details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public UnauthAccessErrorItem reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNAUTHORIZED_ACCESS", value = "")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public UnauthAccessErrorItem recoverable(Boolean recoverable) {
    
    this.recoverable = recoverable;
    return this;
  }

   /**
   * Get recoverable
   * @return recoverable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getRecoverable() {
    return recoverable;
  }


  public void setRecoverable(Boolean recoverable) {
    this.recoverable = recoverable;
  }


  public UnauthAccessErrorItem source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Service", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnauthAccessErrorItem unauthAccessErrorItem = (UnauthAccessErrorItem) o;
    return Objects.equals(this.description, unauthAccessErrorItem.description) &&
        Objects.equals(this.details, unauthAccessErrorItem.details) &&
        Objects.equals(this.reasonCode, unauthAccessErrorItem.reasonCode) &&
        Objects.equals(this.recoverable, unauthAccessErrorItem.recoverable) &&
        Objects.equals(this.source, unauthAccessErrorItem.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, details, reasonCode, recoverable, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnauthAccessErrorItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    recoverable: ").append(toIndentedString(recoverable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

