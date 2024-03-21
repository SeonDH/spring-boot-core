package org.example;

import org.example.runner.ContextRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ContextRunner contextRunner = (ContextRunner) context.getBean("appStartupRunner");
        contextRunner.run();
    }

}