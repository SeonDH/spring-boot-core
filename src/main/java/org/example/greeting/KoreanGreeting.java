package org.example.greeting;


public class KoreanGreeting implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println(name + ", 안녕 세상");
    }


}

