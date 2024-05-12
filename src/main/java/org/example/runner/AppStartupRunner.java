package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.properties.GreetingProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final GreetingProperties greeting;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(greeting.getEnglish());
        System.out.println(greeting.getKorean());
    }
}