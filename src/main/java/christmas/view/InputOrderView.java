package christmas.view;

import christmas.domain.menu.Menu;

import java.util.EnumMap;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.message.ErrorMessage.INVALID_ORDER;
import static christmas.constant.message.InputMessage.ORDER;

public class InputOrderView {
    private static final EnumMap<Menu, Integer> order = new EnumMap<>(Menu.class);

    public static EnumMap<Menu, Integer> inputOrder() {
        while (true) {
            try {
                System.out.println(ORDER);
                typeCasting();
                exceptionCheck();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(INVALID_ORDER);
            }
        }
        return order;
    }

    private static void typeCasting() {
        String[] items = readLine().split(",");
        for (String item : items) {
            String[] parts = item.split("-");
            Menu menuItem = Menu.valueOf(parts[0]);
            int quantity = Integer.parseInt(parts[1]);
            System.out.println(menuItem + parts[1]);
            order.put(menuItem, quantity);
        }
    }

    private static void exceptionCheck() {

    }
}