package org.example.greeting;

import org.example.condition.FalseCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


@Conditional(FalseCondition.class)
@Component
public class KoreanGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("안녕 세상");
    }
}
