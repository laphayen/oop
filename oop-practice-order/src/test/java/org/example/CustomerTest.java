package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문합니다.")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("쫄면", 6000), new MenuItem("군만두", 5000)));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("쫄면", menu, cooking))
                .doesNotThrowAnyException();
    }
}
