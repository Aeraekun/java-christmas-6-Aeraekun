package christmas.domain;

import christmas.domain.menu.Drink;
import christmas.domain.menu.Menu;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static christmas.constant.message.ErrorMessage.INVALID_ORDER;

public record Order(EnumMap<Menu, Integer> order) {

    public Order {
        validate(order);
    }

    private void validate(EnumMap<Menu, Integer> order) {
        Set<String> names = new HashSet<>();
        for (Map.Entry<Menu, Integer> entry : order.entrySet()) {
            Menu menu = entry.getKey();
            Integer i = entry.getValue();
            names.add(menu.name());
            if (i <= 0) {
                throw new IllegalArgumentException(INVALID_ORDER);
            }
        }
        onlyDrink(names);
    }

    private void onlyDrink(Set<String> names) {
        for (String s : names) {
            try {
                Drink.valueOf(s);
            } catch (IllegalArgumentException e) {
                break;
            }
            throw new IllegalArgumentException(INVALID_ORDER);
        }
    }
}
