package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStarterRunner implements ApplicationRunner {

    private final Greeting greeting;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        greeting.sayHello();
    }
}
