public class SomaliCoffee implements CoffeeShop {
    int SomalicoffeePrice = 15;

    @Override
    public int drinkPrice() {
        return SomalicoffeePrice;
    }

    @Override
    public String detailsofthedrink() {
        return "flavor is delicious. Better when it's hot";
    }

    @Override
    public void cupSize() {
        System.out.println("comes in a big cup");
    }

}
