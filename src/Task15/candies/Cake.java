package Task15.candies;

import Task15.Sweetness;

public class Cake extends Sweetness {
    public Cake() {
        super("Cake", 34.59, 500);
        setUniqParam("Торт");
    }

    public Cake(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("Торт");
    }

}
