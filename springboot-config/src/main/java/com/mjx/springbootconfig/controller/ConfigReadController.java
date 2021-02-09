package com.mjx.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigReadController {
    @Value("${my.name}")
    private String name;
    @Value("${my.version}")
    private String version;

    @RequestMapping(value = "/config")
    public String readConfig() {
        return name + " : " + version;
    }
}
