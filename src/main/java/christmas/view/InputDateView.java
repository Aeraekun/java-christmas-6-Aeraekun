package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.Number.MAX_DATE;
import static christmas.constant.Number.MIN_DATE;
import static christmas.constant.message.InputMessage.DATE;
import static christmas.constant.message.ErrorMessage.INVALID_DATE;

public class InputDateView {

    public static int inputDate() {
        System.out.println(DATE);
        return Integer.parseInt(readLine());
    }
}
