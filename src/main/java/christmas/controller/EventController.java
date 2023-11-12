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
        int tempDate;
        Date date;
        while (true) {
            try {
                tempDate = inputDate();
                date = new Date(tempDate);
                break;
            } catch (IllegalArgumentException e) {
                errorDate();
            }
        }
        return date;
    }

    public Order getOrder() {
        EnumMap<Menu, Integer> tempOrder;
        Order order;
        while (true) {
            try {
                tempOrder = inputOrder();
                order = new Order(tempOrder);
                break;
            } catch (IllegalArgumentException e) {
                errorOrder();
            }
        }
        return order;
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
