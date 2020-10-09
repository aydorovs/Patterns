package first_strategy.duck_sim.duck;

import first_strategy.duck_sim.Duck;
import first_strategy.duck_sim.actions.fly.FlyNoWay;
import first_strategy.duck_sim.actions.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        display();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}
