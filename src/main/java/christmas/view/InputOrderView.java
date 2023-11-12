package christmas.view;

import christmas.domain.menu.Menu;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.message.ErrorMessage.INVALID_ORDER;
import static christmas.constant.message.InputMessage.ORDER;

public class InputOrderView {
    private static final EnumMap<Menu, Integer> order = new EnumMap<>(Menu.class);

    public static EnumMap<Menu, Integer> inputOrder() {
        System.out.println(ORDER);
        typeCasting();
        return order;
    }

    private static void typeCasting() {
        String[] items = readLine().split(",");
        Set<String> names = new HashSet<>();
        for (String item : items) {
            String[] parts = item.split("-");
            Menu menuItem = Menu.valueOf(parts[0]);
            int quantity = Integer.parseInt(parts[1]);
            if (names.contains(parts[0])) {
                throw new IllegalArgumentException(INVALID_ORDER);
            }
            names.add(parts[0]);
            order.put(menuItem, quantity);
        }
    }
}
