package org.example.config;

import org.example.sender.DoorayWebHookSender;
import org.example.sender.MessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {

    @Bean
    public MessageSender doorayWebHookSender() {
        return new DoorayWebHookSender();
    }

}