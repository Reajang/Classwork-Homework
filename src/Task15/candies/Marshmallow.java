package Task15.candies;

import Task15.Sweetness;

public class Marshmallow extends Sweetness {
    public Marshmallow() {
        super("Marshmallow", 0.8, 0.3);
        setUniqParam("Зефир");
    }

    public Marshmallow(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("Зефир");
    }
}
