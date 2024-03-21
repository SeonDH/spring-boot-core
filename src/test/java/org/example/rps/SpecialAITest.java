package org.example.rps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialAITest {

    @Test
    void getElement() {
        SpecialAI specialAI = new SpecialAI();

        RpsElement rpsElement = specialAI.getElement();

        assertNotNull(rpsElement);
        assertEquals(rpsElement.getClass(), RpsElement.class);

    }
}