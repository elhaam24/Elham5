public class Latte implements CoffeeShop {
    int LattePrice = 10;

    @Override
    public String detailsofthedrink() {
        return "Smooth and creamy latte";
    }

    @Override
    public void cupSize() {
        System.out.println("comes in a small cup");
    }

    @Override
    public int drinkPrice() {
        return LattePrice;
    }
}
