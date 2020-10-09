package first_strategy.duck_sim;

import first_strategy.duck_sim.actions.fly.FlyRocketPowered;
import first_strategy.duck_sim.duck.MallardDuck;
import first_strategy.duck_sim.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
