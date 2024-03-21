package org.example.config;

import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.example.greeting.American;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

    @Bean
    American innerGreeting() {
        return new American();
    }

    //TODO-1 주입 받고 싶은 객체(InnerGreeting) 을 파라미터로 넣는다.
    @Bean
    Greeting englishGreeting(American american) {
        return new EnglishGreeting(american);
    }


}
