package christmas.view;

import christmas.domain.Event;
import christmas.domain.Price;

import static christmas.constant.message.OutputMessage.BEFORE_DISCOUNT_TITLE;
import static christmas.constant.message.OutputMessage.WON;

public class OutputAfterDiscountView {
    public static void outputAfterDiscount(Event event, Price price) {
        String tempPrice = String.format("%,d", price.price());
        System.out.println(BEFORE_DISCOUNT_TITLE);
        System.out.println(tempPrice + WON);
    }
}
