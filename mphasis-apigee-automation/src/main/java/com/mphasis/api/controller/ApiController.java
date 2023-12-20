package com.mphasis.api.controller;

import com.mphasis.api.business.ApiBusiness;
import com.mphasis.api.model.createApiProxy.CreateApiProxyResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ApiController {

    private ApiBusiness business = new ApiBusiness();

    @RequestMapping(value="/v1/createApi", method = RequestMethod.POST)
    public CreateApiProxyResponse createApi(@RequestParam(value = "name" , defaultValue = "proxy-sample") String name, @RequestParam(value = "org" , defaultValue = "rizvikavish205-eval") String orgName) throws IOException {

        return business.createApiProxy(name, orgName);
    }


    /*@RequestMapping("/v1/getApis")
    public FacadeResponse getApisList(@RequestParam(value = "org" , defaultValue = "rizvikavish205-eval") String orgName) throws IOException {

        return business.getApisList(orgName);
    }*/
}