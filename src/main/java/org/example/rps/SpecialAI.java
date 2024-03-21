package org.example.rps;

import org.springframework.stereotype.Component;

@Component
public class SpecialAI {

    //TODO-3 AI 는 랜덤한 값을 반환한다.
    public RpsElement getElement() {
        return RpsElement.getRandomRpsElement();
    }

}
