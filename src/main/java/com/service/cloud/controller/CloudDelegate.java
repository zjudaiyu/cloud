package com.service.cloud.controller;

import org.springframework.stereotype.Component;


@Component
public class CloudDelegate implements Cloud {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
