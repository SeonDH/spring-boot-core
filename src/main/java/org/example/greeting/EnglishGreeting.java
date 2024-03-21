package org.example.greeting;

public class EnglishGreeting implements Greeting {


    public EnglishGreeting() {
        System.out.println("english java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    @Override
    public void customInit() {
        System.out.println("english java bean initMethod");
    }

    @Override
    public void customDestroy() {
        System.out.println("english java bean customDestroy");
    }

}
