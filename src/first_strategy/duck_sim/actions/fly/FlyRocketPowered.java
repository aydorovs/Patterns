package first_strategy.duck_sim.actions.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
