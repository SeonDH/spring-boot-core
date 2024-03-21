package org.example.greeting;


public class KoreanGreeting implements Greeting {

    public KoreanGreeting() {
        System.out.println("korean java constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

    @Override
    public void customInit() {
        System.out.println("korean java bean initMethod");
    }

    @Override
    public void customDestroy() {
        System.out.println("korean java bean customDestroy");
    }


}

