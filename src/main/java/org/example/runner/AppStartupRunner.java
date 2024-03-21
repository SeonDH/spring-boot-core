package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.example.logging.TimeLogger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final Greeting greeting;
    private final TimeLogger timeLogger;

    @Override
    public void run(ApplicationArguments args) {

        //TODO-2 시간 측정 클래스에 메소드를 보낸다.
        timeLogger.printTime(greeting::sayHello);
    }
}