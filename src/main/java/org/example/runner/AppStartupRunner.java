package org.example.runner;

import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//TODO-3 생성자를 제거하고 @RequiredArgsConstructor 를 넣어본다. (lombok)
//@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-1 주입하고 싶은 객체을 선언
    private final Greeting greeting;

    //TODO-2 주입하고 싶은 객체가 포함된 생성자를 선언
    public AppStartupRunner(Greeting greeting) {
        this.greeting = greeting;
    }


    @Override
    public void run(ApplicationArguments args) {
        greeting.sayHello();
    }
}