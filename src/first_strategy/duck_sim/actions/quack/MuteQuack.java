package first_strategy.duck_sim.actions.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quck() {
        System.out.println("strategy.duck_sim.actions.quack.MuteQuack");
    }
}
