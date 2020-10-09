package fourth_fabric.kind;

import fourth_fabric.Pizza;
import fourth_fabric.PizzaIngridientFactory;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngridientFactory ingridientFactory;

    public NYStyleCheesePizza(PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
    }
}
