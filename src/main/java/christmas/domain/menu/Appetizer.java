package christmas.domain.menu;

public enum Appetizer {
    SOUP(6_000, "양송이수프"),
    TAPAS(5_500, "타파스"),
    SALAD(8_000, "시저샐러드");

    private final int price;
    private final String name;

    Appetizer(final int price, final String name) {
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
