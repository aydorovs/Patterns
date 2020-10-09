package first_strategy.duck_sim.duck;

import first_strategy.duck_sim.Duck;
import first_strategy.duck_sim.actions.fly.FlyWithWings;
import first_strategy.duck_sim.actions.quack.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Hello! I am a strategy.duck_sim.duck.MallardDuck");
    }

    public MallardDuck() {
        display();
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
