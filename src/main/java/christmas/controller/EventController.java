package christmas.controller;

import christmas.domain.Date;
import christmas.domain.menu.Menu;
import christmas.domain.Order;

import java.util.EnumMap;

import static christmas.constant.message.ErrorMessage.errorDate;
import static christmas.constant.message.ErrorMessage.errorOrder;
import static christmas.view.InputDateView.inputDate;
import static christmas.view.InputOrderView.inputOrder;
import static christmas.view.OutputHelloView.outputHello;

public class EventController {
    public void event() {
        printStart();
        Date date = getDate();
        Order order = getOrder();
    }

    public void printStart() {
        outputHello();
    }

    public Date getDate() {
        return inputDate();
    }

    public Order getOrder() {
        return inputOrder();
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
