package org.example.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AopTestUtils;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingTest {

    @Autowired
    private Greeting greeting;

    @Test
    void sayHello() {

        //TODO-1 AopTestUtils 를 통해서 원본 객체를 얻어서 테스트할 수 있다.
        Greeting targetGreeting = AopTestUtils.getTargetObject(greeting);

        System.out.println("=== targetGreeting.sayHello() ===");
        targetGreeting.sayHello();


        System.out.println("=== greeting.sayHello() ===");
        greeting.sayHello();

        //TODO-2 AopUtils 를 통해 프록시 여부를 검사할 수 있다.
        assertFalse(AopUtils.isAopProxy(targetGreeting));
        assertTrue(AopUtils.isAopProxy(greeting));


    }
}