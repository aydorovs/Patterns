package third_decorator.beverage.optional;

import third_decorator.beverage.Beverage;
import third_decorator.beverage.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.35 + beverage.cost();
    }
}
