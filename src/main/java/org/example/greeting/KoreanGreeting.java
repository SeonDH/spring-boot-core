package org.example.greeting;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class KoreanGreeting implements Greeting, InitializingBean, DisposableBean {

    public KoreanGreeting() {
        System.out.println("korean java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

    @Override
    public void customInit() {
        System.out.println("korean custom init");
    }

    @Override
    public void customDestroy() {
        System.out.println("korean custom custom destroy");
    }

    @PostConstruct
    public void customPostConstruct() {
        System.out.println("korean PostConstruct");
    }

    @PreDestroy
    public void customPreDestroy() {
        System.out.println("korean PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("korean DisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("korean InitializingBean afterPropertiesSet");
    }
}

