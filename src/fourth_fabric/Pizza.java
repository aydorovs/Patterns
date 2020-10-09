package fourth_fabric;

import fourth_fabric.ingridient.*;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;

    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

//    protected void prepare() {
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough... ");
//        System.out.println("Adding sauce...");
//        System.out.println("Adding toppings: ");
//        for (String topping : toppings) {
//            System.out.println("  " + topping);
//        }
//    }

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return "Pizza{}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
