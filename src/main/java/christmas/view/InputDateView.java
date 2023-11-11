package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.Number.MAX_DATE;
import static christmas.constant.Number.MIN_DATE;
import static christmas.constant.message.InputMessage.DATE;
import static christmas.constant.message.ErrorMessage.IS_NOT_DATE;

public class InputDateView {
    private static int date;

    public static int inputDate() {
        while (true) {
            try {
                System.out.println(DATE);
                date = Integer.parseInt(readLine());
                exceptionCheck();
                break;
            } catch (NumberFormatException e) {
                System.out.println(IS_NOT_DATE);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return date;
    }

    private static void exceptionCheck() {
        if (date < MIN_DATE || date > MAX_DATE) {
            throw new IllegalArgumentException(IS_NOT_DATE);
        }
    }

}
