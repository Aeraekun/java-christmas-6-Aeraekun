package christmas.view;

import christmas.domain.Date;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static christmas.constant.message.InputMessage.DATE;

public class InputDateView {

    public Date inputDate() {
        Date date;
        while (true) {
            try {
                System.out.println(DATE);
                date = new Date(Integer.parseInt(readLine()));
                break;
            } catch (IllegalArgumentException e) {
                ErrorDateView errorDateView = new ErrorDateView();
                errorDateView.errorDate();
            }
        }
        return date;
    }
}
