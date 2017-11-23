package com.service.cloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-23T06:24:44.274Z")

@RpcSchema(schemaId = "cloud")
public class CloudImpl implements Cloud{

    @Autowired
    private CloudDelegate cloudDelegate;


    public String helloworld(String name) {

        return cloudDelegate.helloworld(name);
    }

}
