package shop;

public class Clothes implements Sellable {

    public void wear(){
        System.out.println("Wear this clothes");
    }

    @Override
    public void sell() {
        System.out.println("Sell clothes");
    }
}
