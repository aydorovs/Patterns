package fourth_fabric.ingridient.factory;

import fourth_fabric.PizzaIngridientFactory;
import fourth_fabric.ingridient.*;

public class ChicagoPizzaIngridientFactory implements PizzaIngridientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoMarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new ChicagoGarlic(), new ChicagoOnion(), new ChicagoMushroom(), new ChicagoRedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoSlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new ChicagoFreshClams();
    }

}
