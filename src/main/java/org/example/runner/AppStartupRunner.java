package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {


    private final ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("=============");

        Greeting greeting = (Greeting) applicationContext.getBean("englishGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

        System.out.println("=============");

        greeting = (Greeting) applicationContext.getBean("englishGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

        System.out.println("=============");

        greeting = (Greeting) applicationContext.getBean("koreanGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

        System.out.println("=============");

        greeting = (Greeting) applicationContext.getBean("koreanGreeting");
        greeting.sayHello();
        System.out.println(greeting.hashCode());

    }
}