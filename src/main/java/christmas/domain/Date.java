package christmas.domain;

import static christmas.constant.Number.MAX_DATE;
import static christmas.constant.Number.MIN_DATE;
import static christmas.constant.message.ErrorMessage.INVALID_DATE;

public record Date(int date) {
    public Date {
        validate(date);
    }

    private void validate(int date) {
        if (date < MIN_DATE || date > MAX_DATE) {
            throw new IllegalArgumentException(INVALID_DATE);
        }
    }
}
