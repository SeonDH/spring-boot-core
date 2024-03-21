package org.example.greeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;


//TODO-1 OutputCaptureExtension 기능을 확장한다.
@ExtendWith(OutputCaptureExtension.class)
@SpringBootTest
class SpringBootTestTest {

    @Autowired
    private Greeting greeting;

    //TODO-2 확장한 기능을 통해 콘솔의 값을 테스트할 수 있다.
    @Test
    void sayHello(CapturedOutput output) {
        greeting.sayHello();
        assertThat(output).contains("hello");
    }
}