package christmas.view;

import christmas.domain.Event;
import christmas.domain.Price;

import static christmas.constant.message.OutputMessage.*;

public class OutputAfterDiscountView {
    public void outputAfterDiscount(Event event, Price price) {
        int tempPrice = price.price() - event.afterDiscount();
        String afterDiscount = String.format(FORMAT, tempPrice);
        System.out.println(AFTER_DISCOUNT_TITLE);
        System.out.println(afterDiscount + WON);
    }
}
