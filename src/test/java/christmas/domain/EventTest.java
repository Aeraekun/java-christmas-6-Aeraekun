package christmas.domain;

import christmas.domain.menu.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.EnumMap;

class EventTest {

    @Mock
    private Date mockDate;
    @Mock
    private Order mockOrder;
    @Mock
    private Price mockPrice;

    private Event event;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        event = new Event(mockDate, mockOrder, mockPrice);
    }

    @Test
    void testWeekendPriceLessThanTenThousand() {
        when(mockPrice.price()).thenReturn(9000);
        when(mockDate.date()).thenReturn(6); // Assuming 6 is a weekend day
        assertThat(event.weekend()).isEqualTo(0);
    }

    @Test
    void testWeekendNotOnWeekend() {
        when(mockPrice.price()).thenReturn(11000);
        when(mockDate.date()).thenReturn(4); // Not a weekend
        assertThat(event.weekend()).isEqualTo(0);
    }

    @Test
    void event_ValidEvent_ShouldCalculateBenefitCorrectly() {
        // Given
        Date date = new Date(25);
        EnumMap<Menu, Integer> validOrder = new EnumMap<>(Menu.class);
        validOrder.put(Menu.초코케이크, 2);
        validOrder.put(Menu.레드와인, 1);
        validOrder.put(Menu.바비큐립, 3);
        Order order = new Order(validOrder);
        Price price = new Price(150_000);

        // When
        Event event = new Event(date, order, price);

        // Then
        assertThat(event.d_Day()).isEqualTo(3_400);
        assertThat(event.weekday()).isEqualTo(4_046);
        assertThat(event.weekend()).isEqualTo(0);
        assertThat(event.special()).isEqualTo(1_000);
        assertThat(event.freeGift()).isEqualTo(25_000);
        assertThat(event.badge()).isEqualTo("산타");
        assertThat(event.allBenefit()).isEqualTo(33_446);
        assertThat(event.afterDiscount()).isEqualTo(8_446);
    }
}
