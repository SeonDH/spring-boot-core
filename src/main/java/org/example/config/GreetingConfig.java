package org.example.config;

import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.example.greeting.KoreanGreeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GreetingConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    @Scope("singleton")
    Greeting englishGreeting() {
        return new EnglishGreeting();
    }


    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    @Scope("prototype")
    Greeting koreanGreeting() {
        return new KoreanGreeting();
    }


}
