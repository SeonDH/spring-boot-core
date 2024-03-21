package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-1 Bean 처럼 가져와서 쓸 수 있다.
    private final TaskExecutor customExecutor;
    private final Greeting greeting;

    @Override
    public void run(ApplicationArguments args) {

        Runnable printThreadName = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Current thread name: " + threadName);
        };

        printThreadName.run();

        System.out.println("==================");

        customExecutor.execute(printThreadName);

        Future<Void> future = greeting.printThreadName();
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                System.err.println("Caught exception: " + cause.getMessage());
            }
        }


    }

}