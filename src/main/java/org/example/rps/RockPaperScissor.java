package org.example.rps;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.example.rps.RpsElement.*;

//TODO-1 가위바위보 프로그램을 살펴본다.
@Service
@RequiredArgsConstructor
public class RockPaperScissor {


    private final SpecialAI specialAI;


    //TODO-2 RpsElement 인자를 받고, SpecialAI 가 반환한 인자와 비교해서 승부를 결정한다.
    public GameResult play(RpsElement playerRpsElement) {
        RpsElement aiRpsElement = specialAI.getElement();

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

}
