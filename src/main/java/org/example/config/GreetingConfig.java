package org.example.config;


import org.example.greeting.DefaultGreeting;
import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.example.greeting.KoreanGreeting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {


    //TODO-7 defaultGreeting 의 위치를 여기로 옮기고 테스트 해본다.

    //TODO-2 locale 의 값이 korean 이면 koreanGreeting 를 사용한다.
    @Bean
    @ConditionalOnProperty(value = "locale", havingValue = "korean")
    Greeting koreanGreeting() {
        return new KoreanGreeting();
    }

    //TODO-3 locale 의 값이 english 이고, American.class 가 존재하면 englishGreeting 를 사용한다.
    @Bean
    @ConditionalOnProperty(value = "locale", havingValue = "english")
    @ConditionalOnClass(name = "org.example.greeting.American")
    Greeting englishGreeting() {
        return new EnglishGreeting();
    }

    //TODO-1 @ConditionalOnMissingBean: Greeting 빈이 등록되지 않으면 defaultGreeting 를 사용한다.
    @Bean
    @ConditionalOnMissingBean(Greeting.class)
    Greeting defaultGreeting() {
        return new DefaultGreeting();
    }


}
