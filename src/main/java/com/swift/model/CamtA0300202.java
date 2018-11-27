/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 1.2.37
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.GetPaymentTransactionsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generated by SWIFT Standards 2017-06-29 13:18:18
 */
@ApiModel(description = "Generated by SWIFT Standards 2017-06-29 13:18:18")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-26T11:46:38.130-05:00")
public class CamtA0300202 {
  @SerializedName("get_payment_transactions_response")
  private GetPaymentTransactionsResponse getPaymentTransactionsResponse = null;

  public CamtA0300202 getPaymentTransactionsResponse(GetPaymentTransactionsResponse getPaymentTransactionsResponse) {
    this.getPaymentTransactionsResponse = getPaymentTransactionsResponse;
    return this;
  }

   /**
   * Get getPaymentTransactionsResponse
   * @return getPaymentTransactionsResponse
  **/
  @ApiModelProperty(value = "")
  public GetPaymentTransactionsResponse getGetPaymentTransactionsResponse() {
    return getPaymentTransactionsResponse;
  }

  public void setGetPaymentTransactionsResponse(GetPaymentTransactionsResponse getPaymentTransactionsResponse) {
    this.getPaymentTransactionsResponse = getPaymentTransactionsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0300202 camtA0300202 = (CamtA0300202) o;
    return Objects.equals(this.getPaymentTransactionsResponse, camtA0300202.getPaymentTransactionsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPaymentTransactionsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0300202 {\n");
    
    sb.append("    getPaymentTransactionsResponse: ").append(toIndentedString(getPaymentTransactionsResponse)).append("\n");
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
