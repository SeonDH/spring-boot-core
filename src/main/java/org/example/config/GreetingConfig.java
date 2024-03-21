package org.example.config;

import org.example.greeting.CglibGreeting;
import org.example.greeting.EnglishGreeting;
import org.example.greeting.KoreanGreeting;
import org.example.greeting.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetingConfig {


    //TODO-2 빈 선언 과정에서 프록시를 빈으로 등록한다.
    @Primary
    @Bean
    Greeting englishGreeting() {
        return new CglibGreeting(new EnglishGreeting());
    }

    @Bean
    Greeting koreanGreeting() {
        return new CglibGreeting(new KoreanGreeting());
    }


}
