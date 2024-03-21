package org.example.greeting;

import org.example.condition.TrueCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(TrueCondition.class)
@Component
public class EnglishGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
