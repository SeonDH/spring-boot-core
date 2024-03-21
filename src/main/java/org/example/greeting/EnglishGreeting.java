package org.example.greeting;

import lombok.extern.slf4j.Slf4j;

//TODO-1 로그를 찍고 싶은 클래스에 @Slf4j 를 붙여준다.
@Slf4j
public class EnglishGreeting implements Greeting {

    //TODO-2 System.out 으로 찍던 로그를 수정한다.
    @Override
    public void sayHello() {
        log.info("hello world");
    }
}
