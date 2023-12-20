package com.mphasis.api.business;

import com.mphasis.api.broker.ServiceBroker;
import com.mphasis.api.model.createApiProxy.CreateApiProxyResponse;

import java.io.IOException;

public class ApiBusiness {

    private ServiceBroker broker = new ServiceBroker();

    public CreateApiProxyResponse createApiProxy(String proxyName, String orgName) throws IOException {

        return broker.createApiProxy(proxyName, orgName);
    }


    /*public FacadeResponse getApisList(String orgName) throws IOException {

        return broker.getApisList(orgName);
    }*/

}
