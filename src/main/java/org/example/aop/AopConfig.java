package org.example.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AopConfig {


    @Pointcut("within(org.example..*)")
    public void withIn() {
    }

    @Pointcut("@annotation(org.example.annotation.Method)")
    public void cutAnnotation() {
    }

    @Around(value = "cutAnnotation() && withIn()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=== around start === ");
        Object object = joinPoint.proceed();
        System.out.println("=== around end === ");
        return object;
    }

}
