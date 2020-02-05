package com.sun.service;

import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    public String getServerInfo(){

        return "获取 provider服务成功";
    }
}
