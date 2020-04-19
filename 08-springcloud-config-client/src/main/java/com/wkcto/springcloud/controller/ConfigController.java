package com.wkcto.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${url}")
    private String url;

    @Autowired
    private Environment env;

    @RequestMapping("/cloud/url")
    public String url () {
        return url;
    }

    @RequestMapping("/cloud/url2")
    public String url2 () {
        return env.getProperty("url");
    }
}