package org.example.greeting;

import org.example.annotation.CustomMethodAnnotation;

public class EnglishGreeting implements Greeting {

    @CustomMethodAnnotation("this is method value")
    @Override
    public void sayHello(String name) {
        System.out.println(name + ", hello world");
    }

}
