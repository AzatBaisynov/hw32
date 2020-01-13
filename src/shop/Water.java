package shop;

public class Water implements Sellable {

    public void drink(){
        System.out.println("Drink this water");
    }

    @Override
    public void sell() {
        System.out.println("Sell water");
    }
}
