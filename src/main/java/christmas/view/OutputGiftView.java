package christmas.view;

import christmas.domain.Event;

import static christmas.constant.Number.ZERO;
import static christmas.constant.message.OutputMessage.*;

public class OutputGiftView {
    public static void outputGift(Event event) {
        System.out.println(FREE_GIFT_TITLE);
        if (event.freeGift() == ZERO) {
            System.out.println(NOTHING);
        }
        if (event.freeGift() != ZERO) {
            System.out.println(CHAMPAGNE);
        }
    }
}
