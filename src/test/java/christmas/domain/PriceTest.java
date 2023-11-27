package christmas.domain;

import christmas.domain.menu.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceTest {

    @Test
    void price_ValidPrice_ShouldReturnCorrectValue() {
        // Given
        Price price = new Price(Menu.양송이수프.getPrice());

        // Then
        assertThat(price.price()).isEqualTo(6_000);
    }
}