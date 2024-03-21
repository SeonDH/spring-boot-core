package org.example.runner;

import org.example.greeting.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-1 주입 받고 싶은 객체을 선언한다.
    //TODO-2 주입 받고 싶은 객체에 @Autowired 를 붙여준다.
    @Autowired
    private Greeting greeting;

    @Override
    public void run(ApplicationArguments args) {
        greeting.sayHello();
    }
}