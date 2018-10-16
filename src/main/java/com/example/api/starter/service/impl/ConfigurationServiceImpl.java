package com.example.api.starter.service.impl;

import com.example.api.starter.model.Configuration;
import com.example.api.starter.repository.ConfigurationRepository;
import com.example.api.starter.service.ConfigurationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@CacheConfig(cacheNames = {"CONFIGURATION"})
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    private ConfigurationRepository configurationRepository;

    @Cacheable(key = "{#key}")
    @Override
    public Optional<Configuration> getConfigurationByKey(String key) {
        return configurationRepository.findByKey(key);
    }
}
