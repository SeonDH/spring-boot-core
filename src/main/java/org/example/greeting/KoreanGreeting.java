package org.example.greeting;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class KoreanGreeting implements Greeting {

    public KoreanGreeting() {
        System.out.println("korean java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

    @PostConstruct
    public void customPostConstruct() {
        System.out.println("korean PostConstruct");
    }

    @PreDestroy
    public void customPreDestroy() {
        System.out.println("korean PreDestroy");
    }
}

