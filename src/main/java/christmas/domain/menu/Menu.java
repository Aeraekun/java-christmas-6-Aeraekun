package christmas.domain.menu;

public enum Menu {
    양송이수프(6_000),
    타파스(5_500),
    시저샐러드(8_000),
    티본스테이크(55_000),
    바비큐립(54_000),
    해산물파스타(35_000),
    크리스마스파스타(25_000),
    초코케이크(15_000),
    아이스크림(5_000),
    제로콜라(3_000),
    레드와인(60_000),
    샴페인(25_000);

    private final int price;

    Menu(final int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
