package org.example.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.example.annotation.CustomMethodAnnotation;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Aspect
@Component
public class GreetingAop {

    @Pointcut("execution(* org.example.greeting..sayHello(..))")
    public void cut() {
    }

    @Pointcut("args(name,..)")
    public void cutArgs(String name) {
    }

    @Pointcut("@annotation(annotationName)")
    public void cutAnnotation(CustomMethodAnnotation annotationName) {
    }

    @Pointcut("within(org.example.greeting.*)")
    public void withInGreeting() {
    }

    //TODO-1 JoinPoint, args 문법 사용 방법 확인
    // JoinPoint 내부 값 확인
    //    @Before(value = "cut() && cutArgs(name)")
    //    public void before(JoinPoint joinPoint, String name) throws Throwable {
    //        Arrays.stream(joinPoint.getArgs()).forEach(System.out::println);
    //        System.out.println();
    //        System.out.println("joinPoint.getThis(): " + joinPoint.getThis());
    //        System.out.println();
    //        System.out.println("joinPoint.getTarget(): " + joinPoint.getTarget());
    //        System.out.println();
    //        System.out.println("joinPoint.getSignature(): " + joinPoint.getSignature());
    //        System.out.println();
    //        System.out.println("joinPoint.toShortString(): " + joinPoint.toShortString());
    //        System.out.println();
    //        System.out.println("joinPoint.toLongString(): " + joinPoint.toLongString());
    //        System.out.println();
    //        System.out.println("arg: " + name);
    //        System.out.println();
    //    }

    //TODO-2 annotationName 문법 사용 방법 확인
    //    @Before(value = "cutAnnotation(annotationName) && withInGreeting()")
    //    public void before(CustomMethodAnnotation annotationName) {
    //        System.out.println(annotationName.value());
    //    }


    //TODO-3 Generic 에 대한 문법 확인. String -> Integer 로 바꿔서 확인해본다.
    //    @Before("execution(* org.example..Generic+.sampleGenericMethod(*)) && args(param)")
    //    public void before(String param) {
    //        System.out.println("== before start==");
    //        System.out.println("before param: " + param);
    //        System.out.println("== before end==");
    //    }

    //TODO-4 Collection 내부까지 검사해주지 않는다. Collection<String> -> Collection<Integer> -> Collection<?> 로 바꿔서 해본다.
    @Before("execution(* org.example..Generic+.sampleGenericCollectionMethod(*)) && args(param)")
    public void beforeSampleMethod(Collection<String> param) {
        try {
            System.out.println("== before start==");
            param.forEach(System.out::println);
            System.out.println("== before end==");
        } catch (Exception e) {
            System.out.println("exception caught: " + e.getMessage());
        }
    }


}
