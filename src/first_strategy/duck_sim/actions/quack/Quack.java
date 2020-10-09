package first_strategy.duck_sim.actions.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quck() {
        System.out.println("Quack");
    }
}
