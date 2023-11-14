package christmas.domain;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import christmas.Application;
import christmas.domain.menu.Menu;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

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

    @Test
    void 스무가지_이상_주문() {
        assertSimpleTest(() -> {
            runException("3", "티본스테이크-4,바비큐립-8,초코케이크-2,제로콜라-6,타파스-4,크리스마스파스타-5");
            assertThat(output()).contains("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        });
    }

    @Test
    void order_ValidOrder_ShouldBeCreated() {
        // Given
        EnumMap<Menu, Integer> validOrder = new EnumMap<>(Menu.class);
        validOrder.put(Menu.양송이수프, 2);
        validOrder.put(Menu.초코케이크, 1);
        validOrder.put(Menu.시저샐러드, 3);

        // When
        Order order = new Order(validOrder);

        // Then
        assertThat(order.order()).containsEntry(Menu.양송이수프, 2);
        assertThat(order.order()).containsEntry(Menu.초코케이크, 1);
        assertThat(order.order()).containsEntry(Menu.시저샐러드, 3);
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
