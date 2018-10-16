package com.example.api.starter.service;

import com.example.api.starter.model.Configuration;

import java.util.Optional;

public interface ConfigurationService {
    Optional<Configuration> getConfigurationByKey(String key);
}
