package org.example;

import org.example.properties.DateProperties;
import org.example.properties.NumberProperties;
import org.example.properties.StringProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({DateProperties.class, NumberProperties.class, StringProperties.class})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}