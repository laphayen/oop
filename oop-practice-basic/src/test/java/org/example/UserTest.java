package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("패스워드 초기화 여부 판단")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        user.initPassword(() -> "abcdefgd");

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드 요구사항 충족하지 않아 초기화X")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(new WrongFixedPasswordGenerator());

        // then
        assertThat(user.getPassword()).isNull();
    }
}