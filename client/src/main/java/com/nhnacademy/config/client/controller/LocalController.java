package com.nhnacademy.config.client.controller;

import com.nhnacademy.config.client.config.LocalConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service")
public class LocalController {

    private final LocalConfig localConfig;

    public LocalController(LocalConfig localConfig){
        this.localConfig = localConfig;
    }

    @GetMapping("/local")
    public String loadLocalConfig(){
        return localConfig.toString();
    }
}
