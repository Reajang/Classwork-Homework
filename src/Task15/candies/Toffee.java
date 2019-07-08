package Task15.candies;

import Task15.Sweetness;

public class Toffee extends Sweetness {
    public Toffee() {
        super("Toffee", 1.7, 1.1);
        setUniqParam("Toffee");
    }

    public Toffee(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("Toffee");
    }
}
