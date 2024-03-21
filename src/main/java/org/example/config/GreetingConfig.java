package org.example.config;

import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.example.greeting.KoreanGreeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {

    //TODO-1 eng profile 인 경우 빈이 활성화 된다.
    @Profile("eng")
    @Bean
    Greeting englishGreeting() {
        return new EnglishGreeting();
    }

    //TODO-2 eng profile 이 아닌 경우 빈이 활성화 된다.
    @Profile("!eng")
    @Bean
    Greeting koreanGreeting() {
        return new KoreanGreeting();
    }

}
