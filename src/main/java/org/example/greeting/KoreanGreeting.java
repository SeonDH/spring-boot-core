package org.example.greeting;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class KoreanGreeting implements Greeting, InitializingBean, DisposableBean {

    public KoreanGreeting() {
        System.out.println("korean java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }


    @Override
    public void destroy() {
        System.out.println("korean DisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("korean InitializingBean afterPropertiesSet");
    }
}

