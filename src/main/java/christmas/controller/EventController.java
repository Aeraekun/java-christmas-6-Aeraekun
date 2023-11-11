package christmas.controller;


import christmas.domain.Date;

import static christmas.view.InputDateView.inputDate;
import static christmas.view.OutputHelloView.outputHello;
public class EventController {
    public void event() {
        printStart();
        Date date = getDate();
    }

    public void printStart() {
        outputHello();
    }

    public Date getDate() {
        int date = inputDate();
        return new Date(date);
    }

    public void getMenu() {

    }

    public void printMenu() {

    }

    public void printBeforeDiscount() {

    }

    public void applyEvent() {

    }

    public void printGiftMenu() {

    }

    public void printDiscount() {

    }

    public void printAfterDiscount() {

    }

    public void printEventBadge() {

    }
}
