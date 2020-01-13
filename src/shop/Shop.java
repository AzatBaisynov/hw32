package shop;

public class Shop {
    private Sellable[] sellables;

    public Shop(int size) {
        if (size > 0) {
            sellables = new Sellable[size];
        }
    }

    public Sellable[] getSellables() {
        return sellables;
    }

    public void setSellables(Sellable[] sellables) {
        this.sellables = sellables;
    }
}
