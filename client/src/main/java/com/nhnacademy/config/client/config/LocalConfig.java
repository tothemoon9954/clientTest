package com.nhnacademy.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@RefreshScope
@Component
public class LocalConfig {

    @Value("${spring.application.name}")
    private String name;

    @Value("${eureka.client.service-url.defaultZone}")
    private String defaultZone;

    public String getUsername() {
        return name;
    }

    public String getDefaultZone() {
        return defaultZone;
    }

    @Override
    public String toString() {
        return "LocalConfig{" +
                "name='" + name + '\'' +
                ", defaultZone='" + defaultZone + '\'' +
                '}';
    }


}

