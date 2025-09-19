package com.example.syntax.annotation.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Value("${myapp.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }
}
