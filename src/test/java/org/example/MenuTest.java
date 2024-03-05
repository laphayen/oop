package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MenuTest {

    @DisplayName("메뉴 이름에 해당하는 메뉴를 반환합니다.")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("쫄면", 6000), new MenuItem("군만두", 5000)));
    }
}
