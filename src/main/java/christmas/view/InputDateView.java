package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.message.InputMessage.DATE;

public class InputDateView {

    public static int inputDate() {
        System.out.println(DATE);
        return Integer.parseInt(readLine());
    }
}
