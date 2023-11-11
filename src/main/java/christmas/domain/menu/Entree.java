package christmas.domain.menu;

public enum Entree {
    STEAK(55_000, "티본스테이크"),
    RIB(54_000, "바비큐립"),
    SEA_PASTA(35_000, "해산물파스타"),
    X_PASTA(25_000, "크리스마스파스타");

    private final int price;
    private final String name;

    Entree(final int price, final String name) {
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
