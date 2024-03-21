package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) {

        //TODO-1 현재 쓰레드 이름을 찍는 Runnable 을 만든다.
        Runnable printThreadName = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Current thread name: " + threadName);
        };

        //TODO-2 쓰레드 이름을 찍어본다.
        printThreadName.run();

        System.out.println("==================");

        try (ExecutorService executor = Executors.newFixedThreadPool(10)) { // 10개의 스레드를 가진 풀 생성
            //TODO-3 execute() 로 쓰레드 이름을 찍어본다.
            executor.execute(printThreadName);
            executor.shutdown();
        } catch (Exception e) {
            //ignore
        }

    }

}