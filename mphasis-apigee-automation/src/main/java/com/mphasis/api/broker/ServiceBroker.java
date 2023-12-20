package com.mphasis.api.broker;

import com.mphasis.api.model.createApiProxy.CreateApiProxyResponse;
import com.mphasis.api.model.createApiProxy.CreateApiRequest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

public class ServiceBroker {

    private String domianUrl = "https://api.enterprise.apigee.com";
    private String basePath = "/v1/o/";
    private String resourceUrl = "/apis";

    private RestTemplate restTemplate;

    public CreateApiProxyResponse getApisList(String orgName) throws IOException {
        /*configureProxySettings();
        String url = domianUrl + basePath + orgName + resourceUrl;
        HttpEntity<CreateApiProxyResponse> requestEntity = generateHeaders();
        RestTemplate restTemplate = new RestTemplate();
        *//**Rest Call to consume Rest Service**//*
        ResponseEntity<CreateApiProxyResponse> responseEntity = restTemplate.exchange(url,HttpMethod.GET,requestEntity,CreateApiProxyResponse.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("Response Satus Code: " + statusCode);
        CreateApiProxyResponse facadeResponse = responseEntity.getBody();

        return facadeResponse;*/
        return null;
    }

    private void configureProxySettings() {
        //Set the http proxy to orrproxy.mphasis.com:8080
        System.setProperty("http.proxyHost", "orrproxy.mphasis.com");
        System.setProperty("http.proxyPort", "8080");

        System.setProperty("https.proxyHost", "orrproxy.mphasis.com");
        System.setProperty("https.proxyPort", "8080");

        // To clear proxy settings, use below code
        //System.clearProperty("http.proxyHost");
    }

    private HttpEntity<CreateApiRequest> generateHeaders(String atrb) {
        String username = "rizvikavish205@gmail.com";
        String password = "Qwerty@12345";
        String authorizationHeader = "Basic " + DatatypeConverter.printBase64Binary((username + ":" + password).getBytes());
        HttpHeaders requestHeaders = new HttpHeaders();
        /** set up HTTP Basic Authentication Header **/
        requestHeaders.add("Authorization", authorizationHeader);
        requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        CreateApiRequest request = new CreateApiRequest();
        request.setName(atrb);
        /**Request entity is created with request headers**/
        HttpEntity<CreateApiRequest> requestEntity = new HttpEntity<>(request, requestHeaders);
        return requestEntity;
    }

    public CreateApiProxyResponse createApiProxy(String proxyName, String orgName) throws IOException {
        configureProxySettings();
        String url = domianUrl + basePath + orgName + resourceUrl;
        HttpEntity<CreateApiRequest> requestEntity = generateHeaders(proxyName);
        restTemplate = new RestTemplate();
        /**Rest Call to consume Rest Service**/
        ResponseEntity<CreateApiProxyResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, CreateApiProxyResponse.class);
        HttpStatusCode statusCode = responseEntity.getStatusCode();
        System.out.println("Response Satus Code: " + statusCode);
        CreateApiProxyResponse createApiProxyResponse = new CreateApiProxyResponse();
        return createApiProxyResponse;
    }
}
