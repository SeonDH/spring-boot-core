package org.example.greeting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//TODO-1 @Component 를 사용하는 경우에도 @Primary 를 사용할 수 있다.
@Primary
@Component
public class EnglishGreeting implements Greeting {


    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

}
