package christmas.view;

import christmas.domain.Event;

import static christmas.constant.Number.ZERO;
import static christmas.constant.message.OutputMessage.*;

public class OutputAllDiscountView {
    public static void outputAllDiscount(Event event) {
        int tempDiscount = event.sumDiscount();
        String tempPrice = String.format("%,d", tempDiscount);
        System.out.println(ALL_DISCOUNT);
        if (tempDiscount != ZERO) {
            System.out.println(MINUS + tempPrice + WON);
        }
        if (tempDiscount == ZERO) {
            System.out.println(tempPrice + WON);
        }
    }
}
