package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.properties.StringProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {


    private final StringProperties stringProperties;

    @Override
    public void run(ApplicationArguments args) {
        try {
            System.out.println(stringProperties.getNotNull());
            System.out.println(stringProperties.getHasLength());
            System.out.println(stringProperties.getNotEmpty());
            System.out.println(stringProperties.getEmail());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}