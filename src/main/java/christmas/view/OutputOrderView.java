package christmas.view;

import christmas.domain.Order;
import christmas.domain.menu.Menu;

import java.util.Map;

import static christmas.constant.message.OutputMessage.ORDER;
import static christmas.constant.message.OutputMessage.ORDER_TITLE;

public class OutputOrderView {
    public void outputOrder(Order order) {
        System.out.println(ORDER_TITLE);
        for (Map.Entry<Menu, Integer> entry : order.order().entrySet()) {
            Menu menu = entry.getKey();
            Integer i = entry.getValue();
            System.out.printf(ORDER, menu.name(), i);
        }
    }
}
