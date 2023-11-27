package christmas.view;

import christmas.domain.Price;

import static christmas.constant.message.OutputMessage.*;

public class OutputBeforeDiscountView {
    public void outputBeforeDiscount(Price price) {
        String tempPrice = String.format(FORMAT, price.price());
        System.out.println(BEFORE_DISCOUNT_TITLE);
        System.out.println(tempPrice + WON);
    }
}
