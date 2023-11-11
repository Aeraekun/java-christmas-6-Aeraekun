package christmas.domain.menu;

public enum Dessert {
    CAKE(15_000, "초코케이크"),
    ICE(5_000, "아이스크림");
    private final int price;
    private final String name;

    Dessert(final int price, final String name) {
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
