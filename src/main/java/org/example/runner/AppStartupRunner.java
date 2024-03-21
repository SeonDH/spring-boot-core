package org.example.runner;

import org.example.greeting.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-1 주입받고 싶은 객체을 선언한다.
    private Greeting greeting;

    //TODO-2 주입 받고 싶은 객체의 세터를 생성한다.
    //TODO-3 세터에 @Autowired 어노테이션을 붙여준다.
    @Autowired
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run(ApplicationArguments args) {
        greeting.sayHello();
    }
}