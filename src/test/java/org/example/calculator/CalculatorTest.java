package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//TODO-2 우리가 만든 계산기가 잘 작동하는지 테스트한다.
class CalculatorTest {


    @Test
    void add() {

        Calculator calculator = new Calculator();
        // Given

        // When
        int result = calculator.add(3, 5);

        // Then
        assertEquals(result, 8);
    }

    @Test
    void subtract() {

        Calculator calculator = new Calculator();
        // Given

        // When
        int result = calculator.subtract(3, 5);

        // Then
        assertEquals(result, -2);

    }

    @Test
    void multiply() {

        Calculator calculator = new Calculator();
        // Given

        // When
        int result = calculator.multiply(3, 5);

        // Then
        assertEquals(result, 15);


    }

    @Test
    void divide() {

        Calculator calculator = new Calculator();
        // Given

        // When
        double result = calculator.divide(-6, -3);

        // Then
        assertEquals(2, result);
    }

    @Test
    void divideZero() {

        Calculator calculator = new Calculator();

        // Given

        // When
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> calculator.divide(-1, 0));

        // Then
        assertEquals("0으로 나눌 수 없습니다.", throwable.getMessage());
    }
}