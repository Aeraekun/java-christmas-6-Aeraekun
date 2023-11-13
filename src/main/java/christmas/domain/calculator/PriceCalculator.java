package christmas.domain.calculator;

import christmas.domain.Order;
import christmas.domain.Price;
import christmas.domain.menu.Menu;

import java.util.Map;

import static christmas.constant.Number.ZERO;

public class PriceCalculator {
    public static Price calculatePrice(Order order) {
        int beforeDiscount = ZERO;
        for (Map.Entry<Menu, Integer> entry : order.order().entrySet()) {
            Menu menu = entry.getKey();
            Integer i = entry.getValue();
            beforeDiscount += menu.getPrice() * i;
        }
        return new Price(beforeDiscount);
    }
}
