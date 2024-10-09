public class Vegetable extends Groceryshop{
    String vegetableID;

    public Vegetable(String groceryproductName, int priceoftheproduct, int quantityoftheroduct, String vegetableID) {
        super(groceryproductName, priceoftheproduct, quantityoftheroduct);
        this.vegetableID = vegetableID;
    }

    @Override
    public void displayDetails() {
        System.out.println("The vegetable name is: " + groceryproductName());
        System.out.println("The price is: " + getPriceoftheproduct());
        System.out.println("The quantity is: " + getQuantityoftheroduct());
        System.out.println("The total price: " + computeTotalCost());
        System.out.println("The vegetable ID is: " + vegetableID);
    }
}
