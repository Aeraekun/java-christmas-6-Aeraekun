package christmas.view;

import christmas.domain.Date;

import static christmas.constant.message.OutputMessage.PREVIEW;

public class OutputPreviewView {
    public void outputPreview(Date date) {
        System.out.printf(PREVIEW, date.date());
    }
}
