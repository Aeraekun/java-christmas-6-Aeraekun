package christmas.domain;

import christmas.domain.menu.Dessert;
import christmas.domain.menu.Drink;
import christmas.domain.menu.Entree;
import christmas.domain.menu.Menu;

import java.util.Map;

import static christmas.constant.Number.*;

public record Event(Date date, Order order, Price price) {
    public int d_Day() {
        if (date.date() < CHRISTMAS) {
            return THOUSAND * (date.date() - MIN_DATE);
        }
        return ZERO;
    }

    public int weekday() {
        if (date.date() % SEVEN == ONE || date.date() % SEVEN == TWO) {
            return ZERO;
        }
        int count = 0;
        for (Map.Entry<Menu, Integer> entry : order.order().entrySet()) {
            Menu menu = entry.getKey();
            Integer i = entry.getValue();
            try {
                Dessert.valueOf(menu.name());
            } catch (IllegalArgumentException e) {
                continue;
            }
            count += i;
        }
        return YEAR * count;
    }

    public int weekend() {
        if (date.date() % SEVEN != ONE && date.date() % SEVEN != TWO) {
            return ZERO;
        }
        int count = 0;
        for (Map.Entry<Menu, Integer> entry : order.order().entrySet()) {
            Menu menu = entry.getKey();
            Integer i = entry.getValue();
            try {
                Entree.valueOf(menu.name());
            } catch (IllegalArgumentException e) {
                continue;
            }
            count += i;
        }
        return YEAR * count;
    }

    public int special() {
        if (date.date() % SEVEN == THREE || date.date() == CHRISTMAS) {
            return THOUSAND;
        }
        return ZERO;
    }

    public int freeGift() {
        if (price.price() >= FREE_GIFT) {
            return Drink.샴페인.getPrice();
        }
        return ZERO;
    }

    public String badge() {
        if (sumDiscount() > SANTA) {
            return "산타";
        }
        if (sumDiscount() > TREE) {
            return "트리";
        }
        if (sumDiscount() > STAR) {
            return "별";
        }
        return "없음";
    }

    public int sumDiscount() {
        return d_Day() + weekday() + weekend() + special() + freeGift();
    }
}
