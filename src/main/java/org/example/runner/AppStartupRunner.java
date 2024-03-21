package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.calculator.Calculator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final Calculator calculator;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(calculator.add(1, 2));
    }
}