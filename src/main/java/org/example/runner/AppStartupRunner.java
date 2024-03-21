package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.properties.DateProperties;
import org.example.properties.NumberProperties;
import org.example.properties.StringProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final DateProperties dateProperties;
    private final NumberProperties numberProperties;
    private final StringProperties stringProperties;

    @Override
    public void run(ApplicationArguments args) {
        try {
            System.out.println(stringProperties.getNotNull());
            System.out.println(stringProperties.getNotEmpty());
            System.out.println(stringProperties.getNotBlank());
            System.out.println(stringProperties.getEmail());
            System.out.println(stringProperties.getSize());
            System.out.println(numberProperties.getPositive());
            System.out.println(numberProperties.getNegative());
            System.out.println(numberProperties.getMax());
            System.out.println(numberProperties.getMin());
            System.out.println(dateProperties.getFuture());
            System.out.println(dateProperties.getPast());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}