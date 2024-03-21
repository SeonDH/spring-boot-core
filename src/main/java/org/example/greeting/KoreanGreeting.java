package org.example.greeting;


import org.springframework.scheduling.annotation.AsyncResult;

import java.util.concurrent.Future;

public class KoreanGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

    @Override
    public Future<Void> printThreadName() {
        return new AsyncResult<>(null);
    }

}

