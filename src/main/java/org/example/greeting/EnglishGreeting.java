package org.example.greeting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnglishGreeting implements Greeting {

    @Override
    public void sayHello() {
        log.trace("hello world trace");
        log.debug("hello world debug");
        log.info("hello world info");
        log.warn("hello world warn");
        log.error("hello world error");
    }
}
