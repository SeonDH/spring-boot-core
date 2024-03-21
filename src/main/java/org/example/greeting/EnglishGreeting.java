package org.example.greeting;

import org.springframework.scheduling.annotation.Async;

public class EnglishGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    //TODO-3 메소드에 @Async 와 사용하고 싶은 TaskExecutor 를 설정할 수 있다.
    @Async("customExecutor")
    @Override
    public void printThreadName() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread name: " + threadName);
    }
}
