package christmas.view;

import christmas.domain.Event;

import static christmas.constant.message.OutputMessage.BADGE_TITLE;

public class OutputEventBadgeView {
    public static void outputEventBadge(Event event) {
        System.out.println(BADGE_TITLE);
        System.out.println(event.badge());
    }
}
