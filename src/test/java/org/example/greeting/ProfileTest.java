package org.example.greeting;

import org.example.web.PrintService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProfileTest {

    @Autowired
    private PrintService printService;

    //TODO-3 spring.profiles.active=test 인 상태로 실행해본다.
    @Test
    void print() {
        printService.print();
    }
}