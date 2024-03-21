package org.example.greeting;

import org.springframework.stereotype.Component;

@Component
public class KoreanGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }

}

