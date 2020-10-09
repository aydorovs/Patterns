package first_strategy.duck_sim.actions.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
