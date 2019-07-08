package Task15.candies;

import Task15.Sweetness;

public class Lollipop extends Sweetness {
    public Lollipop() {
        super("Lollipop", 2.1, 4.1);
        setUniqParam("Леденцы");
    }

    public Lollipop(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("Леденцы");
    }
}
