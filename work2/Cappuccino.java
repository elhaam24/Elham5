public class Cappuccino implements CoffeeShop {
    int CappuccinoPrice = 5;

    @Override
    public String detailsofthedrink() {
        return "rich flavor";
    }

    @Override
    public int drinkPrice() {
        return CappuccinoPrice;
    }

    @Override
    public void cupSize() {
        System.out.println("comes in a medium cup");
    }
}
