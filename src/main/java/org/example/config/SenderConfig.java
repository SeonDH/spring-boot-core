package org.example.config;

import org.example.sender.DoorayWebHookSender;
import org.example.sender.Sender;
import org.example.sender.TelegramWebHookSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {

    @Bean
    Sender doorayWebHookSender() {
        return new DoorayWebHookSender();
    }

    @Bean
    Sender telegramWebHookSender() {
        return new TelegramWebHookSender();
    }

}
