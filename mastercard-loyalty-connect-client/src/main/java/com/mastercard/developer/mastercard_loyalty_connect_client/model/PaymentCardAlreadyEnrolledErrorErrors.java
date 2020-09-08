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
import com.mastercard.developer.mastercard_loyalty_connect_client.model.PaymentCardAlreadyEnrolledErrorItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentCardAlreadyEnrolledErrorErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T19:05:09.264+05:30[Asia/Calcutta]")
public class PaymentCardAlreadyEnrolledErrorErrors {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private List<PaymentCardAlreadyEnrolledErrorItem> error = new ArrayList<PaymentCardAlreadyEnrolledErrorItem>();


  public PaymentCardAlreadyEnrolledErrorErrors error(List<PaymentCardAlreadyEnrolledErrorItem> error) {
    
    this.error = error;
    return this;
  }

  public PaymentCardAlreadyEnrolledErrorErrors addErrorItem(PaymentCardAlreadyEnrolledErrorItem errorItem) {
    this.error.add(errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentCardAlreadyEnrolledErrorItem> getError() {
    return error;
  }


  public void setError(List<PaymentCardAlreadyEnrolledErrorItem> error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardAlreadyEnrolledErrorErrors paymentCardAlreadyEnrolledErrorErrors = (PaymentCardAlreadyEnrolledErrorErrors) o;
    return Objects.equals(this.error, paymentCardAlreadyEnrolledErrorErrors.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardAlreadyEnrolledErrorErrors {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

