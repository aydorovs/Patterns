package fourth_fabric.kind;

import fourth_fabric.Pizza;
import fourth_fabric.PizzaIngridientFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngridientFactory ingridientFactory;

    public ChicagoStyleVeggiePizza(PizzaIngridientFactory ingridientFactory) {
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
