package org.example.rps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

//TODO-1 BDD mockito style
@ExtendWith(MockitoExtension.class)
public class BDDRockPaperScissorTest {

    @Mock
    SpecialAI specialAI;

    @InjectMocks
    RockPaperScissor rockPaperScissor;

    @Test
    void play_withMockedSpecialAI_shouldReturnLose() {
        // given
        given(specialAI.getElement()).willReturn(RpsElement.ROCK);

        // when
        GameResult result = rockPaperScissor.play(RpsElement.SCISSOR);

        // then
        then(specialAI).should(times(1)).getElement();
        assertEquals(GameResult.LOSE, result);
    }

}
