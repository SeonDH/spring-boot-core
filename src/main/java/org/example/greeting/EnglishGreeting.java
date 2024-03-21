package org.example.greeting;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EnglishGreeting implements Greeting, InitializingBean, DisposableBean {


    public EnglishGreeting() {
        System.out.println("english java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }


    @Override
    public void customInit() {
        System.out.println("english custom init");
    }

    @Override
    public void customDestroy() {
        System.out.println("eng custom custom destroy");
    }

    @PostConstruct
    public void customPostConstruct() {
        System.out.println("eng PostConstruct");
    }

    @PreDestroy
    public void customPreDestroy() {
        System.out.println("eng PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("english DisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("english InitializingBean afterPropertiesSet");
    }
}
