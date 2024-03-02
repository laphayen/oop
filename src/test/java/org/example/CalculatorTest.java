package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @DisplayName("덧셈 연산 수행")
    @Test
    void additionTest() {
        int result = Calculator.calculate(1, "+", 2);

        assertThat(result).isEqualTo(3);
    }
}
