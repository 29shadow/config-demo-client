package com.gtzhou.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WebController {

    @Value("${config.env}")
    private String  env;

    @Value("${spring.datasource.url}")
    private String url;

    @RequestMapping("/url")
    public String getUrl(){
        return this.url;
    }
}
