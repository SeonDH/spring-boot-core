package org.example.greeting;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class EnglishGreeting implements Greeting {


    public EnglishGreeting() {
        System.out.println("english java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    @PostConstruct
    public void init() {
        System.out.println("eng PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("eng PreDestroy");
    }

}
