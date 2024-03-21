package org.example;

import org.example.properties.GreetingProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


//TODO-3 ConfigurationProperties 로 선언한 파일을 @Configuration 에 선언한다. (@SpringBootApplication 도 @Configuration)
// ConfigurationProperties 파일에 @Component 를 붙이는 경우 생략 가능
@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}