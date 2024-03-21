package org.example.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


//TODO-2 @Aspect 어노테이션은 이 클래스가 어스펙트임을 나타낸다. (aspect)
@Aspect
@Component
public class GreetingAop {

    //TODO-3 @Pointcut 어노테이션은 특정 실행 지점을 정의한다. 여기서는 org.example.greeting 패키지의 sayHello() 메소드가 실행될 때. (Join Point)
    @Pointcut("execution(* org.example.greeting..sayHello())")
    public void cut() {
    }

    //TODO-4 @Around 어드바이스는 Pointcut에 정의된 메소드 실행 전후로 추가 로직을 실행 (Advice)
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
