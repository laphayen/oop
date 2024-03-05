package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @DisplayName("메뉴판에서 메뉴 이름에 해당하는 메뉴를 반환합니다.")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("쫄면", 6000), new MenuItem("군만두", 5000)));

        MenuItem menuItem = menu.choose("쫄면");

        assertThat(menuItem).isEqualTo(new MenuItem("쫄면", 6000));
    }

    @DisplayName("메뉴판에 없는 메뉴를 선택 시 예외를 반환합니다.")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("쫄면", 6000), new MenuItem("군만두", 5000)));

        assertThatCode(() -> menu.choose("짜장면"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 메뉴 이름입니다.");
    }
}
