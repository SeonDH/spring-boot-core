package org.example.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class GreetingAspect {
    @Pointcut("execution(* org.example.sender.Greeting.sayHello())")
    public void cut() {
    }

    @Around("cut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }
}
