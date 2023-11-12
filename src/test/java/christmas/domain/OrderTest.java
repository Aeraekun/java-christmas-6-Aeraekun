package christmas.domain;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import christmas.Application;
import org.junit.jupiter.api.Test;

class OrderTest extends NsTest {

    @Test
    void 메뉴판에_없는_메뉴() {
        assertSimpleTest(() -> {
            runException("3", "파스타-2");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Test
    void 메뉴의_개수가_문자() {
        assertSimpleTest(() -> {
            runException("3", "해산물파스타-a");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Test
    void 메뉴가_0_이하() {
        assertSimpleTest(() -> {
            runException("3", "해산물파스타-0");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Test
    void 메뉴_입력_형식_이상() {
        assertSimpleTest(() -> {
            runException("3", "해산물파스타!1");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Test
    void 중복_메뉴_주문() {
        assertSimpleTest(() -> {
            runException("3", "해산물파스타-1,해산물파스타-2");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Test
    void 음료_메뉴만_주문() {
        assertSimpleTest(() -> {
            runException("3", "제로콜라-1,레드와인-2");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
