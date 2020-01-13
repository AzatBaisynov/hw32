package shop;

public class Food implements Sellable {

    public void eat(){
        System.out.println("Eat this food");
    }

    @Override
    public void sell() {
        System.out.println("Sell food");
    }
}
