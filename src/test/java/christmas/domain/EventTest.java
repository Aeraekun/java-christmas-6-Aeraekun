package christmas.domain;

import christmas.domain.menu.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static christmas.constant.Number.YEAR;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Map;
import java.util.HashMap;

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


}
