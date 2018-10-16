package com.example.api.starter.repository;

import com.example.api.starter.model.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Integer> {
    Optional<Configuration> findByKey(String key);
}
