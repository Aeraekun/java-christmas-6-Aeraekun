package christmas.view;

import christmas.domain.Date;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.message.ErrorMessage.errorDate;
import static christmas.constant.message.InputMessage.DATE;

public class InputDateView {

    public static Date inputDate() {
        Date date;
        while (true){
            try {
                System.out.println(DATE);
                date = new Date(Integer.parseInt(readLine()));
                break;
            } catch (IllegalArgumentException e) {
                errorDate();
            }
        }
        return date;
    }
}
