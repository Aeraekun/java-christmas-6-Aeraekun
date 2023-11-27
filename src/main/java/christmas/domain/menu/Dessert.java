package christmas.domain.menu;

public enum Dessert {
    초코케이크(15_000),
    아이스크림(5_000);
    private final int price;

    Dessert(final int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
