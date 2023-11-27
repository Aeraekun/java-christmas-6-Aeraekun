package christmas.view;

import christmas.domain.Event;

import static christmas.constant.Number.ZERO;
import static christmas.constant.message.OutputMessage.*;

public class OutputEventView {
    public void outputEvent(Event event) {
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

    public void d_DayNotZero(Event event) {
        if (event.d_Day() != ZERO) {
            String tempPrice = String.format(FORMAT, event.d_Day());
            System.out.printf(D_DAY, tempPrice);
        }
    }

    public void weekDayNotZero(Event event) {
        if (event.weekday() != ZERO) {
            String tempPrice = String.format(FORMAT, event.weekday());
            System.out.printf(WEEKDAY, tempPrice);
        }
    }

    public void weekendNotZero(Event event) {
        if (event.weekend() != ZERO) {
            String tempPrice = String.format(FORMAT, event.weekend());
            System.out.printf(WEEKEND, tempPrice);
        }
    }

    public void specialNotZero(Event event) {
        if (event.special() != ZERO) {
            String tempPrice = String.format(FORMAT, event.special());
            System.out.printf(SPECIAL, tempPrice);
        }
    }

    public void freeGiftNotZero(Event event) {
        if (event.freeGift() != ZERO) {
            String tempPrice = String.format(FORMAT, event.freeGift());
            System.out.printf(GIFT, tempPrice);
        }
    }


}
