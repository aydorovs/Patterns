package fourth_fabric;

import fourth_fabric.ingridient.factory.NYPizzaIngridientFactory;
import fourth_fabric.kind.CheesePizza;
import fourth_fabric.kind.ClamPizza;
import fourth_fabric.kind.PepperoniPizza;
import fourth_fabric.kind.VeggiPizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingridientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
