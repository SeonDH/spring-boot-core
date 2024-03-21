package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {


    private final Greeting greeting;

    @Override
    public void run(ApplicationArguments args) {

        //TODO-1 Runnable 에는 실행할 코드가 정의 되어있다.
        // () -> {} 이 문법이 익숙하지 않다면 자바의 람다 표현식과 익명함수 부분을 살펴볼 것
        Runnable task1 = () -> System.out.println("runnable task");
        //TODO-2 Runnable 은 메서드 참조를 통해 다른 객체의 메서드를 Runnable의 실행 코드로 지정할 수 있다
        Runnable task2 = greeting::sayHello;

        System.out.println("=== before task1 ===");
        //TODO-3 run() 을 통해 실행 가능
        task1.run();
        //TODO-4 Runnable을 매개변수로 받는 메서드를 사용하여 코드의 재사용성과 가독성을 높일 수 있다
        testRunnable(task1);
        System.out.println("=== after task1 ===");

        System.out.println("=== before task2 ===");
        task2.run();
        testRunnable(task2);
        System.out.println("=== after task1 ===");

    }

    private void testRunnable(Runnable runnable) {
        runnable.run();
    }
}