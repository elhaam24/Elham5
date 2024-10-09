abstract class Groceryshop {
    String groceryproductName;
    int priceoftheproduct;
    int quantityoftheroduct;

    public Groceryshop(String groceryproductName, int priceoftheproduct, int quantityoftheroduct) {
        this.groceryproductName = groceryproductName;
        this.priceoftheproduct = priceoftheproduct;
        this.quantityoftheroduct = quantityoftheroduct;
    }

    public abstract void displayDetails();

    public int computeTotalCost() {
        return priceoftheproduct * quantityoftheroduct;
    }

    public String groceryproductName() {
        return groceryproductName;
    }

    public int getPriceoftheproduct() {
        return priceoftheproduct;
    }

    public int getQuantityoftheroduct() {
        return quantityoftheroduct;
    }
}
