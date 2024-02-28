package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {

    @DisplayName("비밀번호 최소 8자 이상, 12 이하이면 예외가 발생하지 않습니다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("laphayen"))
                .doesNotThrowAnyException();
    }
}
