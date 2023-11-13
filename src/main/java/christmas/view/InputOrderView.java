package christmas.view;

import christmas.domain.Order;
import christmas.domain.menu.Menu;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.message.ErrorMessage.INVALID_ORDER;
import static christmas.constant.message.InputMessage.ORDER;
import static christmas.constant.message.OutputMessage.BAR;
import static christmas.constant.message.OutputMessage.COMMA;
import static christmas.view.ErrorOrderView.errorOrder;

public class InputOrderView {
    private static final EnumMap<Menu, Integer> tempOrder = new EnumMap<>(Menu.class);

    public static Order inputOrder() {
        while (true) {
            try {
                System.out.println(ORDER);
                typeCasting();
                return new Order(tempOrder);
            } catch (IllegalArgumentException e) {
                errorOrder();
                tempOrder.clear();
            }
        }
    }

    private static void typeCasting() {
        String[] items = readLine().split(COMMA);
        Set<String> names = new HashSet<>();
        for (String item : items) {
            String[] parts = item.split(BAR);
            Menu menuItem = Menu.valueOf(parts[0]);
            int quantity = Integer.parseInt(parts[1]);
            if (names.contains(parts[0])) {
                throw new IllegalArgumentException(INVALID_ORDER);
            }
            names.add(parts[0]);
            tempOrder.put(menuItem, quantity);
        }
    }
}