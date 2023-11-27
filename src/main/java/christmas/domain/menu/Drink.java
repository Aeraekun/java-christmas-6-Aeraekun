package christmas.domain.menu;

public enum Drink {
    제로콜라(3_000),
    레드와인(60_000),
    샴페인(25_000);
    private final int price;

    Drink(final int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
