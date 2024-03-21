package org.example.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class GreetingAop {

    //TODO-1 실행 순서를 확인한다.
    // around 시작 -> before -> afterReturn(afterThrowing) -> after -> around 종료
    @Pointcut("execution(* org.example.greeting..sayHello())")
    public void cut() {
    }

    @Before("cut()")
    public void before() throws Throwable {
        System.out.println("before");
    }

    @AfterReturning("cut()")
    public void afterReturning() throws Throwable {
        System.out.println("afterReturning");
    }

    @AfterThrowing("cut()")
    public void afterThrowing() throws Throwable {
        System.out.println("afterThrowing");
    }

    @After("cut()")
    public void after() {
        System.out.println("after");
    }


    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("around1");

        Object object = joinPoint.proceed();

        System.out.println("around2");

        return object;

    }
}
