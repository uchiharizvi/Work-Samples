package com.mphasis.api;/*
package createApiWithCurl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CreateProxy {


    public void createApiInEdge(String orgName, String apiProxyName) throws IOException {
        String apigeeUrl = "https://api.enterprise.apigee.com";
        String command = "curl -X POST \\\n" +
                apigeeUrl + "/v1/o/" + orgName + "/apis \\\n" +
                "  -H 'Authorization: Basic cml6dmlrYXZpc2gyMDVAZ21haWwuY29tOlF3ZXJ0eUAxMjM0NQ==' \\\n" +
                "  -H 'Content-type: application/json' \\\n" +
                "  -H 'Postman-Token: 98bb00da-144c-4c44-aa3d-a6681c23971c' \\\n" +
                "  -H 'cache-control: no-cache' \\\n" +
                "  -d '{\"name\" : \"kavishSampleProxy\"}'";
        */
/*ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
        processBuilder.directory(new File("C:/Users/ahmedkavsih.rizvi/Desktop/apigeeNewProxy/"));

        Process process = processBuilder.start();
        InputStream inputStream = process.getInputStream();
        int exitCode = process.exitValue();*//*


        Process process = Runtime.getRuntime().exec(command);
        process.getInputStream();

        //process.destroy();

    }


}
*/
