package org.example.greeting;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EnglishGreeting implements Greeting {

    private final American american;

    @Override
    public void sayHello() {
        american.sayEnglish();
    }
}
