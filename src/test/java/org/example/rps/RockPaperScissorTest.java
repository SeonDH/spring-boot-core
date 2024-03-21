package org.example.rps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RockPaperScissorTest {

    @Spy
    SpecialAI specialAI;

    @InjectMocks
    RockPaperScissor rockPaperScissor;


    @Test
    void play() {

        // Given
        SpecialAI specialAI = Mockito.spy(SpecialAI.class);
        when(specialAI.getElement()).thenReturn(RpsElement.ROCK);

        RockPaperScissor rockPaperScissor = new RockPaperScissor(specialAI);

        // When
        GameResult gameResult = rockPaperScissor.play(RpsElement.SCISSOR);

        // Then
        assertEquals(gameResult, GameResult.LOSE);
    }
}