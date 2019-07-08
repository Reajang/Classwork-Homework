package Task15.candies;

import Task15.Sweetness;


public class Biscuit extends Sweetness {
    public Biscuit() {
        super("Biscuit", 10.1, 3.2);
        setUniqParam("Печенье");
    }

    public Biscuit(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("Печенье");
    }
}
