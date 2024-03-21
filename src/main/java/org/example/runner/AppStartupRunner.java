package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

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

        greeting.printThreadName();

    }

}