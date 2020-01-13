package shop;

public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop(6);

        for (int i = 0; i < shop1.getSellables().length; i++){
            if (i < 2){
                shop1.getSellables()[i] = new Food();
            }
            else if (i < 4){
                shop1.getSellables()[i] = new Water();
            } else {
                shop1.getSellables()[i] = new Clothes();
            }
        }

        for (Sellable sellable : shop1.getSellables()){
            sellable.sell();
            if (sellable instanceof Food){
                ((Food)sellable).eat();
            }
            else if (sellable instanceof Water){
                ((Water)sellable).drink();
            } else {
                ((Clothes)sellable).wear();
            }
        }
    }
}
