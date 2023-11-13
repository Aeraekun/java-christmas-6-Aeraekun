package christmas.view;

import christmas.domain.Event;

import static christmas.constant.Number.ZERO;
import static christmas.constant.message.OutputMessage.*;

public class OutputEventView {
    public static void outputEvent(Event event) {
        System.out.println(EVENT_TITLE);
        if (event.allBenefit() == ZERO) {
            System.out.println(NOTHING);
        }
        if (event.allBenefit() != ZERO) {
            d_DayNotZero(event);
            weekDayNotZero(event);
            weekendNotZero(event);
            specialNotZero(event);
            freeGiftNotZero(event);
        }
    }

    public static void d_DayNotZero(Event event) {
        if (event.d_Day() != ZERO) {
            String tempPrice = String.format("%,d", event.d_Day());
            System.out.printf(D_DAY, tempPrice);
        }
    }

    public static void weekDayNotZero(Event event) {
        if (event.weekday() != ZERO) {
            String tempPrice = String.format("%,d", event.weekday());
            System.out.printf(WEEKDAY, tempPrice);
        }
    }

    public static void weekendNotZero(Event event) {
        if (event.weekend() != ZERO) {
            String tempPrice = String.format("%,d", event.weekend());
            System.out.printf(WEEKEND, tempPrice);
        }
    }

    public static void specialNotZero(Event event) {
        if (event.special() != ZERO) {
            String tempPrice = String.format("%,d", event.special());
            System.out.printf(SPECIAL, tempPrice);
        }
    }

    public static void freeGiftNotZero(Event event) {
        if (event.freeGift() != ZERO) {
            String tempPrice = String.format("%,d", event.freeGift());
            System.out.printf(GIFT, tempPrice);
        }
    }


}
