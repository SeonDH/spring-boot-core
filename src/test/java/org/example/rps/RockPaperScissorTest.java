package org.example.rps;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO-5 방법1 @Mock, @InjectMock
//@ExtendWith(MockitoExtension.class)
class RockPaperScissorTest {


    //TODO-4 가위바위보를 테스트하고 싶은데, SpecialAI 가 랜덤값을 반환하므로 테스트하기가 힘들다.
    @Test
    void play() {
        SpecialAI specialAI = new SpecialAI();
        RockPaperScissor rockPaperScissor = new RockPaperScissor(specialAI);

        GameResult gameResult = rockPaperScissor.play(RpsElement.PAPER);

        assertEquals(gameResult, GameResult.WIN);
    }


    //TODO-6 방법1. SpecialAI 를 목으로 만들어서 사용할 수 있다.
    //
    //    @Mock
    //    SpecialAI specialAI;
    //
    //    @InjectMocks
    //    RockPaperScissor rockPaperScissor;
    //
    //    @Test
    //    void play() {
    //
    //
    //        // Given
    //        when(specialAI.getElement()).thenReturn(RpsElement.ROCK);
    //
    //        // When
    //        GameResult gameResult = rockPaperScissor.play(RpsElement.SCISSOR);
    //
    //        // Then
    //        assertEquals(gameResult, GameResult.LOSE);
    //    }

    //TODO-7 방법2. Mockito.mock 으로 직접 mock 을 생성할 수도 있다.
    //    @Test
    //    void play() {
    //
    //        // Given
    //        SpecialAI specialAI = Mockito.mock(SpecialAI.class);
    //        when(specialAI.getElement()).thenReturn(RpsElement.ROCK);
    //        RockPaperScissor rockPaperScissor = new RockPaperScissor(specialAI);
    //
    //        // When
    //        GameResult gameResult = rockPaperScissor.play(RpsElement.SCISSOR);
    //
    //        // Then
    //        assertEquals(gameResult, GameResult.LOSE);
    //    }
}