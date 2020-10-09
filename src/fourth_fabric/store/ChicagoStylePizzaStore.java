package fourth_fabric.store;

import fourth_fabric.Pizza;
import fourth_fabric.PizzaIngridientFactory;
import fourth_fabric.PizzaStore;
import fourth_fabric.ingridient.factory.NYPizzaIngridientFactory;
import fourth_fabric.kind.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingridientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {

            pizza = new VeggiPizza(ingridientFactory);
            pizza.setName("New York Style Veggie Pizza");

        }
        return pizza;
    }
}
