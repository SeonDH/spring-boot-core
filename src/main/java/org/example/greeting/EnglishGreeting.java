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

    //TODO-1 @PostConstruct, @PreDestroy 메소드를 구현해준다.
    @PostConstruct
    public void customPostConstruct() {
        System.out.println("english PostConstruct");
    }

    @PreDestroy
    public void customPreDestroy() {
        System.out.println("english PreDestroy");
    }

}
