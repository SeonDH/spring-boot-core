package org.example.rps;

import java.util.Random;

public enum RpsElement {
    ROCK, PAPER, SCISSOR;

    public static RpsElement getRandomRpsElement() {
        Random random = new Random();
        RpsElement[] values = RpsElement.values();
        return values[random.nextInt(values.length)];
    }
}
