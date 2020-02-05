package com.sun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getProviderServerInfo")
    public String getProviderServerInfo(){

        String forObject = restTemplate.getForObject("http://PROVIDER/getServerInfo", String.class);

        return forObject;
    }
}
