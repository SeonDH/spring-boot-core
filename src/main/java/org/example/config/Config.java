package org.example.config;

import org.example.service.Aservice;
import org.example.service.Bservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    Aservice aservice() {
        return new Aservice(bservice());
    }

    @Bean
    @Scope("singleton")
    Bservice bservice() {
        return new Bservice();
    }

}
