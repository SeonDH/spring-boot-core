package org.example.greeting;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//TODO-1 InitializingBean, DisposableBean 를 구현한다.
public class EnglishGreeting implements Greeting, InitializingBean, DisposableBean {

    public EnglishGreeting() {
        System.out.println("english java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    @Override
    public void destroy() {
        System.out.println("english DisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("english InitializingBean afterPropertiesSet");
    }
}
