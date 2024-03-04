package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴 항목을 생성합니다.")
    @Test
    void createTest() {
        assertThatCode(() -> new MenuItem("쫄면", 6000))
                .doesNotThrowAnyException();
    }
}
