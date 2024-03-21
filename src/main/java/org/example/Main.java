package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    //TODO-2 실행 할 때, profile 정보를 넣어서 실행한다.
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}