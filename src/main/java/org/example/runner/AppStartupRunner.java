package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.properties.GreetingProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-4 생성한 GreetingProperties 를 Bean 처럼 사용할 수 있다.
    private final GreetingProperties greeting;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(greeting.getEnglish());
        System.out.println(greeting.getKorean());
    }
}