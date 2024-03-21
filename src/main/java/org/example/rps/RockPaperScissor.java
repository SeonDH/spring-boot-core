package org.example.rps;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.example.rps.RpsElement.*;

@Service
@RequiredArgsConstructor
public class RockPaperScissor {


    private final SpecialAI specialAI;


    // 가위바위보
    public GameResult play(RpsElement playerRpsElement) {
        RpsElement aiRpsElement = specialAI.getElement();

        aiAlgorithm();

        if (playerRpsElement == null && aiRpsElement == null) {
            return GameResult.DRAW;
        } else if (playerRpsElement == null) {
            // 안내면 진다.
            return GameResult.LOSE;
        } else if (aiRpsElement == null) {
            return GameResult.WIN;
        }

        if (playerRpsElement == aiRpsElement) {
            return GameResult.DRAW;
        } else if (ROCK == playerRpsElement) {
            if (SCISSOR == aiRpsElement) {
                return GameResult.WIN;
            } else if (PAPER == aiRpsElement) {
                return GameResult.LOSE;
            }
        } else if (PAPER == playerRpsElement) {
            if (ROCK == aiRpsElement) {
                return GameResult.WIN;
            } else if (SCISSOR == aiRpsElement) {
                return GameResult.LOSE;
            }
        } else if (SCISSOR == playerRpsElement) {
            if (PAPER == aiRpsElement) {
                return GameResult.WIN;
            } else if (ROCK == aiRpsElement) {
                return GameResult.LOSE;
            }
        }

        return GameResult.DRAW;
    }

    //TODO-1 AI 가 하는 동작들이 많이 들었다. 이 모든걸 다 mock 해줘야 한다.
    private void aiAlgorithm() {
        System.out.println(specialAI.doSomething1().toUpperCase());
        System.out.println(specialAI.doSomething2().toUpperCase());
        System.out.println(specialAI.doSomething3().toUpperCase());
        System.out.println(specialAI.doSomething4().toUpperCase());
    }

}
