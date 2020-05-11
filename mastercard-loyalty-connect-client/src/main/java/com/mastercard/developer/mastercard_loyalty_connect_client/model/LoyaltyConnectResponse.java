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
 * LoyaltyConnectResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T11:15:32.100+05:30[Asia/Calcutta]")
public class LoyaltyConnectResponse {
  public static final String SERIALIZED_NAME_BANK_CARD_NUMBER = "bankCardNumber";
  @SerializedName(SERIALIZED_NAME_BANK_CARD_NUMBER)
  private String bankCardNumber;

  public static final String SERIALIZED_NAME_LOYALTY_CONNECT_REFERENCE_ID = "loyaltyConnectReferenceId";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CONNECT_REFERENCE_ID)
  private String loyaltyConnectReferenceId;

  public static final String SERIALIZED_NAME_LOYALTY_ID = "loyaltyId";
  @SerializedName(SERIALIZED_NAME_LOYALTY_ID)
  private String loyaltyId;

  public static final String SERIALIZED_NAME_MEMBER_MERCHANT_REFERENCE_ID = "memberMerchantReferenceId";
  @SerializedName(SERIALIZED_NAME_MEMBER_MERCHANT_REFERENCE_ID)
  private String memberMerchantReferenceId;

  public static final String SERIALIZED_NAME_MERCHANT_CODE = "merchantCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CODE)
  private String merchantCode;

  public static final String SERIALIZED_NAME_PAYMENT_CARD_REFERENCE_ID = "paymentCardReferenceId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD_REFERENCE_ID)
  private String paymentCardReferenceId;


  public LoyaltyConnectResponse bankCardNumber(String bankCardNumber) {
    
    this.bankCardNumber = bankCardNumber;
    return this;
  }

   /**
   * Masked Payment Card number connected by the Member
   * @return bankCardNumber
  **/
  @ApiModelProperty(example = "XXXXXXXXXXXX4444", required = true, value = "Masked Payment Card number connected by the Member")

  public String getBankCardNumber() {
    return bankCardNumber;
  }


  public void setBankCardNumber(String bankCardNumber) {
    this.bankCardNumber = bankCardNumber;
  }


  public LoyaltyConnectResponse loyaltyConnectReferenceId(String loyaltyConnectReferenceId) {
    
    this.loyaltyConnectReferenceId = loyaltyConnectReferenceId;
    return this;
  }

   /**
   * A system generated unique identifier for the Member&#39;s Payment Card and Merchant Loyalty ID connection
   * @return loyaltyConnectReferenceId
  **/
  @ApiModelProperty(example = "f962ad86-d408-467c-8b74-14983569d36c", required = true, value = "A system generated unique identifier for the Member's Payment Card and Merchant Loyalty ID connection")

  public String getLoyaltyConnectReferenceId() {
    return loyaltyConnectReferenceId;
  }


  public void setLoyaltyConnectReferenceId(String loyaltyConnectReferenceId) {
    this.loyaltyConnectReferenceId = loyaltyConnectReferenceId;
  }


  public LoyaltyConnectResponse loyaltyId(String loyaltyId) {
    
    this.loyaltyId = loyaltyId;
    return this;
  }

   /**
   * Unique Identifier assigned by Merchant to its every Member
   * @return loyaltyId
  **/
  @ApiModelProperty(example = "jsmith@mastercard.com", required = true, value = "Unique Identifier assigned by Merchant to its every Member")

  public String getLoyaltyId() {
    return loyaltyId;
  }


  public void setLoyaltyId(String loyaltyId) {
    this.loyaltyId = loyaltyId;
  }


  public LoyaltyConnectResponse memberMerchantReferenceId(String memberMerchantReferenceId) {
    
    this.memberMerchantReferenceId = memberMerchantReferenceId;
    return this;
  }

   /**
   * A system generated unique identifier for the Member and Merchant Loyalty ID connection
   * @return memberMerchantReferenceId
  **/
  @ApiModelProperty(example = "3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0", required = true, value = "A system generated unique identifier for the Member and Merchant Loyalty ID connection")

  public String getMemberMerchantReferenceId() {
    return memberMerchantReferenceId;
  }


  public void setMemberMerchantReferenceId(String memberMerchantReferenceId) {
    this.memberMerchantReferenceId = memberMerchantReferenceId;
  }


  public LoyaltyConnectResponse merchantCode(String merchantCode) {
    
    this.merchantCode = merchantCode;
    return this;
  }

   /**
   * Unique Identifier assigned by Mastercard to every partner onboarded with MLC.
   * @return merchantCode
  **/
  @ApiModelProperty(example = "MLCMerchant", required = true, value = "Unique Identifier assigned by Mastercard to every partner onboarded with MLC.")

  public String getMerchantCode() {
    return merchantCode;
  }


  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }


  public LoyaltyConnectResponse paymentCardReferenceId(String paymentCardReferenceId) {
    
    this.paymentCardReferenceId = paymentCardReferenceId;
    return this;
  }

   /**
   * Unique reference key for a member&#39;s payment card
   * @return paymentCardReferenceId
  **/
  @ApiModelProperty(example = "5f0d07c1-6fc4-4e74-9152-0e20bb7104d9", required = true, value = "Unique reference key for a member's payment card")

  public String getPaymentCardReferenceId() {
    return paymentCardReferenceId;
  }


  public void setPaymentCardReferenceId(String paymentCardReferenceId) {
    this.paymentCardReferenceId = paymentCardReferenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyConnectResponse loyaltyConnectResponse = (LoyaltyConnectResponse) o;
    return Objects.equals(this.bankCardNumber, loyaltyConnectResponse.bankCardNumber) &&
        Objects.equals(this.loyaltyConnectReferenceId, loyaltyConnectResponse.loyaltyConnectReferenceId) &&
        Objects.equals(this.loyaltyId, loyaltyConnectResponse.loyaltyId) &&
        Objects.equals(this.memberMerchantReferenceId, loyaltyConnectResponse.memberMerchantReferenceId) &&
        Objects.equals(this.merchantCode, loyaltyConnectResponse.merchantCode) &&
        Objects.equals(this.paymentCardReferenceId, loyaltyConnectResponse.paymentCardReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCardNumber, loyaltyConnectReferenceId, loyaltyId, memberMerchantReferenceId, merchantCode, paymentCardReferenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyConnectResponse {\n");
    sb.append("    bankCardNumber: ").append(toIndentedString(bankCardNumber)).append("\n");
    sb.append("    loyaltyConnectReferenceId: ").append(toIndentedString(loyaltyConnectReferenceId)).append("\n");
    sb.append("    loyaltyId: ").append(toIndentedString(loyaltyId)).append("\n");
    sb.append("    memberMerchantReferenceId: ").append(toIndentedString(memberMerchantReferenceId)).append("\n");
    sb.append("    merchantCode: ").append(toIndentedString(merchantCode)).append("\n");
    sb.append("    paymentCardReferenceId: ").append(toIndentedString(paymentCardReferenceId)).append("\n");
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

