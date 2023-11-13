package christmas.domain;

import christmas.domain.menu.Dessert;
import christmas.domain.menu.Drink;
import christmas.domain.menu.Entree;
import christmas.domain.menu.Menu;

import java.util.Map;

import static christmas.constant.Number.*;
import static christmas.constant.message.OutputMessage.*;

public record Event(Date date, Order order, Price price) {
    public int d_Day() {
        if (price.price() < TEN_THOUSAND || date.date() > CHRISTMAS) {
            return ZERO;
        }
        return THOUSAND + (date.date() - MIN_DATE) * HUNDRED;
    }

    public int weekday() {
        if (price.price() < TEN_THOUSAND || (date.date() % SEVEN == ONE || date.date() % SEVEN == TWO)) {
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
        if (price.price() < TEN_THOUSAND || (date.date() % SEVEN != ONE && date.date() % SEVEN != TWO)) {
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
        if (price.price() < TEN_THOUSAND || (date.date() % SEVEN != THREE && date.date() != CHRISTMAS)) {
            return ZERO;
        }
        return THOUSAND;
    }

    public int freeGift() {
        if (price.price() < FREE_GIFT) {
            return Drink.샴페인.getPrice();
        }
        return ZERO;
    }

    public String badge() {
        if (sumDiscount() > SANTA) {
            return SANTA_BADGE;
        }
        if (sumDiscount() > TREE) {
            return TREE_BADGE;
        }
        if (sumDiscount() > STAR) {
            return STAR_BADGE;
        }
        return NOTHING;
    }

    public int sumDiscount() {
        return d_Day() + weekday() + weekend() + special() + freeGift();
    }
}
