package org.example.greeting;

import org.springframework.scheduling.annotation.Async;

public class EnglishGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    @Async("customExecutor")
    @Override
    public void printThreadName() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread name: " + threadName);
    }
}
