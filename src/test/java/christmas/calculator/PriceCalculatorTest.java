package christmas.calculator;

import christmas.domain.Order;
import christmas.domain.Price;
import christmas.domain.calculator.PriceCalculator;
import christmas.domain.menu.Menu;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static christmas.domain.menu.Menu.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {
    PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    void calculatePrice_ValidOrder_ShouldReturnCorrectPrice() {
        // Given
        EnumMap<Menu, Integer> validOrder = new EnumMap<>(Menu.class);
        validOrder.put(제로콜라, 2);
        validOrder.put(초코케이크, 1);
        validOrder.put(티본스테이크, 3);
        Order order = new Order(validOrder);

        // When
        Price calculatedPrice = priceCalculator.calculatePrice(order);

        // Then
        assertThat(calculatedPrice.price()).isEqualTo(186000);
    }

    @Test
    void calculatePrice_EmptyOrder_ShouldReturnZeroPrice() {
        // Given
        Order emptyOrder = new Order(new EnumMap<>(Menu.class));

        // When
        Price calculatedPrice = priceCalculator.calculatePrice(emptyOrder);

        // Then
        assertThat(calculatedPrice.price()).isZero();
    }
}
