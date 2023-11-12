package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.Number.MAX_DATE;
import static christmas.constant.Number.MIN_DATE;
import static christmas.constant.message.InputMessage.DATE;
import static christmas.constant.message.ErrorMessage.INVALID_DATE;

public class InputDateView {
    private static int date;

    public static int inputDate() {
        while (true) {
            try {
                System.out.println(DATE);
                date = Integer.parseInt(readLine());
                exceptionCheck();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return date;
    }

    private static void exceptionCheck() {
        if (date < MIN_DATE || date > MAX_DATE) {
            throw new IllegalArgumentException(INVALID_DATE);
        }
    }
}
