package org.example.greeting;

import org.example.rps.GameResult;
import org.example.rps.RockPaperScissor;
import org.example.rps.RpsElement;
import org.example.rps.SpecialAI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class SpringBootTestTest {

    //TODO-1 @SpringBootTest 를 사용하는 경우 모든 Bean 을 컨텍스트에 로드하므로 빈을 사용할 수 있다.
    @Autowired
    private Greeting greeting;

    @Test
    void sayHello() {
        greeting.sayHello();
    }

    //TODO-2 등록된 빈도 Mock 으로 대체할 수 있다.
    // Spy 도 가능하다. @SpyBean
    @MockBean
    private SpecialAI specialAI;

    @Autowired
    private RockPaperScissor rockPaperScissor;

    @Test
    void rockPaperScissorTest() {
        when(specialAI.doSomething1()).thenReturn("1");
        when(specialAI.doSomething2()).thenReturn("2");
        when(specialAI.doSomething3()).thenReturn("3");
        when(specialAI.doSomething4()).thenReturn("4");
        when(specialAI.getElement()).thenReturn(RpsElement.ROCK);

        GameResult gameResult = rockPaperScissor.play(RpsElement.SCISSOR);

        assertEquals(GameResult.LOSE, gameResult);
    }

}