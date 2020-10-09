package third_decorator.beverage.optional;

import third_decorator.beverage.Beverage;
import third_decorator.beverage.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.14 + beverage.cost();
    }
}
