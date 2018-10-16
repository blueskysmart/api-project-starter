package com.example.api.starter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableCaching
@EnableScheduling
@ConditionalOnProperty(value = "app.config.cache.enabled", matchIfMissing = true)
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager(
                "CONFIGURATION");
    }

    @CacheEvict(allEntries = true, cacheNames = {
            "CONFIGURATION"})
    @Scheduled(fixedDelayString = "${app.config.cache.expiredTime:600000}")
    public void cacheEvict() {
    }
}
