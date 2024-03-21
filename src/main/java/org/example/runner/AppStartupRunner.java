package org.example.runner;

import org.example.properties.StudentProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    //TODO-4 Bean 처럼 사용
    StudentProperties studentProperties;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(studentProperties.getFirstName());
    }
}