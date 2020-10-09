package third_decorator.beverage.type;

import third_decorator.beverage.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
