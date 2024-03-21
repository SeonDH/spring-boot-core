package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.generic.Generic;
import org.example.greeting.Greeting;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final Greeting greeting;
    private final Generic<String> genericString;
    private final Generic<Integer> genericInteger;

    @Override
    public void run(ApplicationArguments args) {

        //            greeting.sayHello("sando");

        //TODO-3
        //            genericString.sampleGenericMethod("genericString");
        //            genericInteger.sampleGenericMethod(1);

        //TODO-4
        //            genericString.sampleGenericCollectionMethod(List.of("genericString1", "genericString2"));
        //            genericInteger.sampleGenericCollectionMethod(List.of(1, 2));

    }
}