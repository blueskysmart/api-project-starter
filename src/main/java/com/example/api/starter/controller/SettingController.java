package com.example.api.starter.controller;

import com.example.api.starter.model.Configuration;
import com.example.api.starter.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingController {

    private ConfigurationService configurationService;

    @Autowired
    public SettingController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping(value = "/settings/configurations", produces = MediaType.APPLICATION_JSON_VALUE)
    public Configuration getConfigurations() {
        return configurationService.getConfigurationByKey("name").orElseThrow(RuntimeException::new);
    }
}
