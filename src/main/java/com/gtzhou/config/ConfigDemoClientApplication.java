package com.gtzhou.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class ConfigDemoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigDemoClientApplication.class, args);
    }
}
