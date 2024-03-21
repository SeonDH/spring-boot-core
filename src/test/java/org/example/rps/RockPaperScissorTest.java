package org.example.rps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RockPaperScissorTest {

    @Mock
    SpecialAI specialAI;

    @InjectMocks
    RockPaperScissor rockPaperScissor;

    //TODO-2 나는 SpecialAI 에서 getElement() 부분만 모킹이 필요해서, mock 을 선언했는데 나머지 부분들까지 모두 when 을 표현해야한다.
    @Test
    void play() {


        // Given
        when(specialAI.getElement()).thenReturn(RpsElement.ROCK);
        when(specialAI.doSomething1()).thenReturn("iam doing something 1");
        when(specialAI.doSomething2()).thenReturn("iam doing something 2");
        when(specialAI.doSomething3()).thenReturn("iam doing something 3");
        when(specialAI.doSomething4()).thenReturn("iam doing something 4");

        // When
        GameResult gameResult = rockPaperScissor.play(RpsElement.SCISSOR);

        // Then
        assertEquals(gameResult, GameResult.LOSE);
    }


    //TODO-3 spy 를 사용하면, 불필요한 메소드들을 모킹하지 않아도 된다.
    //        @Test
    //        void play() {
    //
    //            // Given
    //            SpecialAI specialAI = Mockito.spy(SpecialAI.class);
    //            when(specialAI.getElement()).thenReturn(RpsElement.ROCK);
    //
    //            RockPaperScissor rockPaperScissor = new RockPaperScissor(specialAI);
    //
    //            // When
    //            GameResult gameResult = rockPaperScissor.play(RpsElement.SCISSOR);
    //
    //            // Then
    //            assertEquals(gameResult, GameResult.LOSE);
    //        }
}