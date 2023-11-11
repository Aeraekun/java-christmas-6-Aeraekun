package christmas.domain.menu;

public enum Drink {
    COKE(3_000, "제로콜라"),
    WINE(60_000, "레드와인"),
    CHAMPAGNE(25_000, "샴페인");
    private final int price;
    private final String name;

    Drink(final int price, final String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
