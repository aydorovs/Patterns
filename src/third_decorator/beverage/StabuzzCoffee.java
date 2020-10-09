package third_decorator.beverage;

import third_decorator.beverage.type.DarkRoast;
import third_decorator.beverage.type.Espresso;
import third_decorator.beverage.type.HouseBlend;
import third_decorator.beverage.optional.Mocha;
import third_decorator.beverage.optional.Soy;
import third_decorator.beverage.optional.Whip;

public class StabuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
