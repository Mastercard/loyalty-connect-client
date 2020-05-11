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
 * Merchant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-30T11:15:32.100+05:30[Asia/Calcutta]")
public class Merchant {
  public static final String SERIALIZED_NAME_MERCHANT_CODE = "merchantCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CODE)
  private String merchantCode;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;


  public Merchant merchantCode(String merchantCode) {
    
    this.merchantCode = merchantCode;
    return this;
  }

   /**
   * Unique code assigned to a merchant on boarded with Mlc
   * @return merchantCode
  **/
  @ApiModelProperty(example = "MLCMerchant", required = true, value = "Unique code assigned to a merchant on boarded with Mlc")

  public String getMerchantCode() {
    return merchantCode;
  }


  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }


  public Merchant merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Merchant Name associated with the Merchant Code.
   * @return merchantName
  **/
  @ApiModelProperty(example = "Liberty", required = true, value = "Merchant Name associated with the Merchant Code.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.merchantCode, merchant.merchantCode) &&
        Objects.equals(this.merchantName, merchant.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCode, merchantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    sb.append("    merchantCode: ").append(toIndentedString(merchantCode)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

