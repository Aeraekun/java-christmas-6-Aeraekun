package christmas.controller;

import christmas.domain.*;
import christmas.domain.calculator.PriceCalculator;
import christmas.view.*;

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
        printAllBenefit(event);
        printAfterDiscount(event, price);
        printEventBadge(event);
    }

    public void printStart() {
        OutputHelloView outputHello = new OutputHelloView();
        outputHello.outputHello();
    }

    public Date getDate() {
        InputDateView inputDateView = new InputDateView();
        return inputDateView.inputDate();
    }

    public Order getOrder() {
        InputOrderView inputOrderView = new InputOrderView();
        return inputOrderView.inputOrder();
    }

    public void printPreview(Date date) {
        OutputPreviewView outputPreviewView = new OutputPreviewView();
        outputPreviewView.outputPreview(date);
    }

    public void printOrder(Order order) {
        OutputOrderView outputOrderView = new OutputOrderView();
        outputOrderView.outputOrder(order);
    }

    public Price getBeforeDiscount(Order order) {
        PriceCalculator priceCalculator = new PriceCalculator();
        return priceCalculator.calculatePrice(order);
    }

    public void printBeforeDiscount(Price price) {
        OutputBeforeDiscountView outputBeforeDiscountView = new OutputBeforeDiscountView();
        outputBeforeDiscountView.outputBeforeDiscount(price);
    }

    public Event applyEvent(Date date, Order order, Price price) {
        return new Event(date, order, price);
    }

    public void printGift(Event event) {
        OutputGiftView outputGiftView = new OutputGiftView();
        outputGiftView.outputGift(event);
    }

    public void printEvent(Event event) {
        OutputEventView outputEventView = new OutputEventView();
        outputEventView.outputEvent(event);
    }

    public void printAllBenefit(Event event) {
        OutputAllBenefitView outputAllBenefitView = new OutputAllBenefitView();
        outputAllBenefitView.outputAllBenefit(event);
    }

    public void printAfterDiscount(Event event, Price price) {
        OutputAfterDiscountView outputAfterDiscountView = new OutputAfterDiscountView();
        outputAfterDiscountView.outputAfterDiscount(event, price);
    }

    public void printEventBadge(Event event) {
        OutputEventBadgeView outputEventBadgeView = new OutputEventBadgeView();
        outputEventBadgeView.outputEventBadge(event);
    }
}
