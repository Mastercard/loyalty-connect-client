/*
 * Mastercard Loyalty Connect Service
 * Connecting payment and retail loyalty into a single checkout experience
 *
 * The version of the OpenAPI document: 2.2.1
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
 * LoyaltyProgram
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T19:05:09.264+05:30[Asia/Calcutta]")
public class LoyaltyProgram {
  public static final String SERIALIZED_NAME_LOYALTY_ID = "loyaltyId";
  @SerializedName(SERIALIZED_NAME_LOYALTY_ID)
  private String loyaltyId;


  public LoyaltyProgram loyaltyId(String loyaltyId) {
    
    this.loyaltyId = loyaltyId;
    return this;
  }

   /**
   * Loyalty Id represents unique member merchant association
   * @return loyaltyId
  **/
  @ApiModelProperty(example = "vk@mastercard.com", required = true, value = "Loyalty Id represents unique member merchant association")

  public String getLoyaltyId() {
    return loyaltyId;
  }


  public void setLoyaltyId(String loyaltyId) {
    this.loyaltyId = loyaltyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyProgram loyaltyProgram = (LoyaltyProgram) o;
    return Objects.equals(this.loyaltyId, loyaltyProgram.loyaltyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyProgram {\n");
    sb.append("    loyaltyId: ").append(toIndentedString(loyaltyId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

