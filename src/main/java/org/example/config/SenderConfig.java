package org.example.config;

import org.example.sender.DoorayWebHookSender;
import org.example.sender.MessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SenderConfig {

    @Primary
    @Bean
    MessageSender doorayWebHookSender() {
        return new DoorayWebHookSender();
    }

}
