package first_strategy.duck_sim.actions.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}
