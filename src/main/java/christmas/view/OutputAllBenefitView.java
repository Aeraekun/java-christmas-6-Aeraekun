package christmas.view;

import christmas.domain.Event;

import static christmas.constant.Number.ZERO;
import static christmas.constant.message.OutputMessage.*;

public class OutputAllBenefitView {
    public static void outputAllBenefit(Event event) {
        int tempDiscount = event.allBenefit();
        String tempPrice = String.format(FORMAT, tempDiscount);
        System.out.println(ALL_DISCOUNT);
        if (tempDiscount != ZERO) {
            System.out.println(MINUS + tempPrice + WON);
        }
        if (tempDiscount == ZERO) {
            System.out.println(tempPrice + WON);
        }
    }
}
