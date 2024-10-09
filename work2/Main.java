import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       CoffeeShop somaliCoffee = new SomaliCoffee();
       CoffeeShop latte = new Latte();
       CoffeeShop cappuccino = new Cappuccino();

        List<CoffeeShop> coffeeShop = new ArrayList<>();
        coffeeShop.add(somaliCoffee);
        coffeeShop.add(latte);
        coffeeShop.add(cappuccino);

        for(CoffeeShop coffee : coffeeShop){
            coffee.cupSize();
            System.out.println("The price is: " + coffee.drinkPrice());
            System.out.println("The description: " + coffee.detailsofthedrink());
            System.out.println("-----------------: " );

        }


    }
}
