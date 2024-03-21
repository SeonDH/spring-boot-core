package org.example.rps;

import org.springframework.stereotype.Component;

@Component
public class SpecialAI {

    public RpsElement getElement() {
        return RpsElement.getRandomRpsElement();
    }

}
