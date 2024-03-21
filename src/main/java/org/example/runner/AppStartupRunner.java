package org.example.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {


    @Value("${greeting.english}+${greeting.korean}")
    private String value1;

    @Value("${greeting.english}" + "${greeting.korean}")
    private String value2;

    @Value("${number.one}${number.two}")
    private String value3;

    @Value("${number.one}" + "${number.two}")
    private String value4;

    @Value("${number.one}" + "${number.two}")
    private int value5;

    @Value("#{1+2}")
    private String value6;

    @Value("#{${number.one} + ${number.two}}")
    private int value7;

    @Value("#{${number.one} eq 1}")
    private boolean value8;

    @Value("#{${number.one} eq \"1\"}")
    private boolean value9;

    @Value("#{${number.one} + ${number.two} + (${number.three} ?: 4)}")
    private int value10;


    @Override
    public void run(ApplicationArguments args) {
        System.out.println(value1);
    }
}