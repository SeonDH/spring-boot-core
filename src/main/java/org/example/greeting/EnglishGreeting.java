package org.example.greeting;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.concurrent.Future;

public class EnglishGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    //TODO-3 메소드에 @Async 와 사용하고 싶은 TaskExecutor 를 설정할 수 있다.
    @Async("customExecutor")
    @Override
    public Future<Void> printThreadName() {

        System.out.println("dosometing");

        if (true) {
            throw new RuntimeException("약속된 오류");
        }
        return new AsyncResult<>(null);
    }
}
