package com.sun.controller;

import com.sun.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    ProviderService providerService;

    @GetMapping("/getServerInfo")
    public String getServerInfo(){
        return providerService.getServerInfo();
    }

}
