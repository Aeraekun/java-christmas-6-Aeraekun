package christmas.domain.menu;

public enum Entree {
    티본스테이크(55_000),
    바비큐립(54_000),
    해산물파스타(35_000),
    크리스마스파스타(25_000);

    private final int price;

    Entree(final int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
