package com.example.onlinelibrary.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.onlinelibrary.dao")
@EntityScan(basePackages = "com.example.onlinelibrary.model")
public class AppConfig {
}
