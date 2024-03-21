package org.example.greeting;

import org.example.web.PrintService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


// TODO-3 ActiveProfile 을 없애고 테스트를 돌려본다. (spring.profiles.active=test 이 없는 걸 확인 할 것)
@ActiveProfiles("test")
@SpringBootTest
public class ProfileTest {

    @Autowired
    private PrintService printService;

    @Test
    void print() {
        printService.print();
    }
}