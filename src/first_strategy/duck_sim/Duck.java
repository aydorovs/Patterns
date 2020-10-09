package first_strategy.duck_sim;

import first_strategy.duck_sim.actions.fly.FlyBehavior;
import first_strategy.duck_sim.actions.quack.QuackBehavior;

public abstract class Duck {
    
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.quck();
    }

    public void swim() {
        System.out.println("Swim!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
