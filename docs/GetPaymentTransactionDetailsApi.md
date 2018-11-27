# GetPaymentTransactionDetailsApi

All URIs are relative to *https://sandbox.swift.com/swift-apitracker-pilot/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentTransactionDetailsPost**](GetPaymentTransactionDetailsApi.md#getPaymentTransactionDetailsPost) | **POST** /get_payment_transaction_details | Get Payment Transaction Details


<a name="getPaymentTransactionDetailsPost"></a>
# **getPaymentTransactionDetailsPost**
> CamtA0200202 getPaymentTransactionDetailsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord)

Get Payment Transaction Details

This API is a payment query to get detailed information regarding a given payment. It requires the UETR to be known.

### Example
```java
// Import classes:
//import com.swift.ApiException;
//import com.swift.api.GetPaymentTransactionDetailsApi;


GetPaymentTransactionDetailsApi apiInstance = new GetPaymentTransactionDetailsApi();
String laUApplicationID = "001"; // String | ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys
String laUVersion = "1.0"; // String | version of the LAUSigned header. Mandatory. \"1.0\" for this first release
String laUCallTime = "2018-03-23T15:56:26.728Z"; // String | timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ
String laURequestNonce = "e802ab96-bb3a-4965-9139-5214b9f0f074"; // String | a random value generated by the client. Provided with the request and copied by the gpi Connector on the response
String laUSigned = "(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])"; // String | service specific HTTP headers
String laUSignature = "U1khA8h9Lm1PqzB99fG6uw=="; // String | contains the LAU signature, base64 ecoded
String xApiKey = "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B"; // String | An API key given to your application to authenticate against the sandbox URL
CamtA0200102 requestBody = new CamtA0200102(); // CamtA0200102 | Payment Transaction Request
String xRecord = "0"; // String | A type of API response to get from API Sandbox. A value between 1 and 13
try {
    CamtA0200202 result = apiInstance.getPaymentTransactionDetailsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetPaymentTransactionDetailsApi#getPaymentTransactionDetailsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **laUApplicationID** | **String**| ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys | [default to 001]
 **laUVersion** | **String**| version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release | [default to 1.0]
 **laUCallTime** | **String**| timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ | [default to 2018-03-23T15:56:26.728Z]
 **laURequestNonce** | **String**| a random value generated by the client. Provided with the request and copied by the gpi Connector on the response | [default to e802ab96-bb3a-4965-9139-5214b9f0f074]
 **laUSigned** | **String**| service specific HTTP headers | [default to (ApplAPIKey&#x3D;yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole&#x3D;[FullViewer/Scope/cclabeb0])]
 **laUSignature** | **String**| contains the LAU signature, base64 ecoded | [default to U1khA8h9Lm1PqzB99fG6uw&#x3D;&#x3D;]
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B]
 **requestBody** | [**CamtA0200102**](CamtA0200102.md)| Payment Transaction Request |
 **xRecord** | **String**| A type of API response to get from API Sandbox. A value between 1 and 13 | [optional] [default to 0]

### Return type

[**CamtA0200202**](CamtA0200202.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
