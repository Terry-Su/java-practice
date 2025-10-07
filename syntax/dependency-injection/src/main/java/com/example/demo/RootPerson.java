package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RootPerson {
    @Autowired
    private RootTool tool;
    public void UseTool() {
        tool.Work();
    }
}
