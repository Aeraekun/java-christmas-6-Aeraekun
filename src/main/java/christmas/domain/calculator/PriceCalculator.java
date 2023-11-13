package christmas.domain.calculator;

import christmas.domain.Order;
import christmas.domain.Price;
import christmas.domain.menu.Menu;

import java.util.Map;

public class PriceCalculator {
    public static Price calculatePrice(Order order) {
        int beforeDiscount = 0;
        for (Map.Entry<Menu, Integer> entry : order.order().entrySet()) {
            Menu menu = entry.getKey();
            Integer i = entry.getValue();
            beforeDiscount += menu.getPrice() * i;
        }
        return new Price(beforeDiscount);
    }
}
