# DefaultApi

All URIs are relative to *http://api.pchowdhury.com/crm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomer**](DefaultApi.md#addCustomer) | **POST** /customer | adds a new customer
[**deleteCustomer**](DefaultApi.md#deleteCustomer) | **DELETE** /customer/{customerId} | Delete existing customer
[**getCustomer**](DefaultApi.md#getCustomer) | **GET** /customer | reads a customer data
[**updateCustomer**](DefaultApi.md#updateCustomer) | **PUT** /customer/{customerId} | update existing customer


<a name="addCustomer"></a>
# **addCustomer**
> Integer addCustomer(body)

adds a new customer

Add a new customer to the System

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Customer body = new Customer(); // Customer | new customer data in JSON format
try {
    Integer result = apiInstance.addCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)| new customer data in JSON format |

### Return type

**Integer**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="deleteCustomer"></a>
# **deleteCustomer**
> Customer deleteCustomer(customerId)

Delete existing customer

Deletes existing customer from system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer customerId = 56; // Integer | Customer Id that needs to be deleted
try {
    Customer result = apiInstance.deleteCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Customer Id that needs to be deleted |

### Return type

[**Customer**](Customer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> Customer getCustomer(customerId)

reads a customer data

This operation uses customer id to identify in a query string

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer customerId = 56; // Integer | pass customer id
try {
    Customer result = apiInstance.getCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| pass customer id |

### Return type

[**Customer**](Customer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateCustomer"></a>
# **updateCustomer**
> updateCustomer(body, customerId)

update existing customer

Updates an existing customer in system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Customer body = new Customer(); // Customer | updated customer data input
Integer customerId = 56; // Integer | id of customer to update
try {
    apiInstance.updateCustomer(body, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)| updated customer data input |
 **customerId** | **Integer**| id of customer to update |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

