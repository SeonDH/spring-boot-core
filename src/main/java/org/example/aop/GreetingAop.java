package org.example.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Aspect
@Component
public class GreetingAop {

    @Pointcut("execution(* org.example.greeting..sayHello())")
    public void cut() {
    }

    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        System.out.println("===== StopWatch start =====");
        stopWatch.start();

        Object object = joinPoint.proceed();

        stopWatch.stop();
        System.out.println("===== StopWatch stop =====");
        System.out.println(stopWatch.prettyPrint());

        return object;

    }
}
