package org.example.greeting;


public class KoreanGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

    @Override
    public void printThreadName() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Current thread name: " + threadName);
    }

}

