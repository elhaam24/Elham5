public class Fruit extends Groceryshop{
    String fruitID;

    public Fruit(String groceryproductName, int priceoftheproduct, int quantityoftheroduct, String fruitID) {
        super(groceryproductName, priceoftheproduct, quantityoftheroduct);
        this.fruitID = fruitID;
    }

    @Override
    public void displayDetails() {
        System.out.println("The fruit name is: " + groceryproductName());
        System.out.println("The price is: " + getPriceoftheproduct());
        System.out.println("The quantity is: " + getQuantityoftheroduct());
        System.out.println("The total price: " + computeTotalCost());
        System.out.println("The fruit ID is: " + fruitID);
    }
}
