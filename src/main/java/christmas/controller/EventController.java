package christmas.controller;

import christmas.domain.Date;
import christmas.domain.Order;

import static christmas.view.InputDateView.inputDate;
import static christmas.view.InputOrderView.inputOrder;
import static christmas.view.OutputHelloView.outputHello;
import static christmas.view.OutputOrderView.outputOrder;
import static christmas.view.OutputPreviewView.outputPreview;

public class EventController {
    public void event() {
        printStart();
        Date date = getDate();
        Order order = getOrder();
        printPreview(date);
        printOrder(order);
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

    public void printPreview(Date date) {
        outputPreview(date);
    }

    public void printOrder(Order order) {
        outputOrder(order);
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
