package org.example.config;

import org.example.sender.ConsoleSender;
import org.example.sender.Sender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {

    @Bean
    Sender consoleSender() {
        return new ConsoleSender();
    }

}
