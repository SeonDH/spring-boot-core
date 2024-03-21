package org.example.greeting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnglishGreeting implements Greeting {

    @Override
    public void sayHello() {
        log.info("hello world");
    }
}
