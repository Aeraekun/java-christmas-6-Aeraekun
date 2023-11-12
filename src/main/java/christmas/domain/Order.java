package christmas.domain;

import christmas.domain.menu.Menu;

import java.util.EnumMap;

import static christmas.constant.Number.MAX_DATE;
import static christmas.constant.Number.MIN_DATE;
import static christmas.constant.message.ErrorMessage.INVALID_ORDER;

public record Order(EnumMap<Menu, Integer> orderMenu) {

    public Order{
    }

    private void validate(int date) {
        if (date < MIN_DATE || date > MAX_DATE) {
            throw new IllegalArgumentException(INVALID_ORDER);
        }
    }


}
