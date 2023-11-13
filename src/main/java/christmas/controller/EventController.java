package christmas.controller;

import christmas.domain.Date;
import christmas.domain.Order;
import christmas.domain.Price;
import christmas.domain.Event;

import static christmas.domain.calculator.PriceCalculator.calculatePrice;
import static christmas.view.InputDateView.inputDate;
import static christmas.view.InputOrderView.inputOrder;
import static christmas.view.OutputAfterDiscountView.outputAfterDiscount;
import static christmas.view.OutputAllDiscountView.outputAllDiscount;
import static christmas.view.OutputBeforeDiscountView.outputBeforeDiscount;
import static christmas.view.OutputEventView.outputEvent;
import static christmas.view.OutputGiftView.outputGift;
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
        Price price = getBeforeDiscount(order);
        printBeforeDiscount(price);
        Event event = applyEvent(date, order, price);
        printGift(event);
        printEvent(event);
        printAllDiscount(event);
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

    public Price getBeforeDiscount(Order order) {
        return calculatePrice(order);
    }

    public void printBeforeDiscount(Price price) {
        outputBeforeDiscount(price);
    }

    public Event applyEvent(Date date, Order order, Price price) {
        return new Event(date, order, price);
    }

    public void printGift(Event event) {
        outputGift(event);
    }

    public void printEvent(Event event) {
        outputEvent(event);
    }

    public void printAllDiscount(Event event) {
        outputAllDiscount(event);
    }

    public void printAfterDiscount(Event event, Price price) {
        outputAfterDiscount(event, price);
    }

    public void printEventBadge() {

    }
}
