package Task15.candies;

import Task15.Sweetness;

public class Gingerbread extends Sweetness {
    public Gingerbread() {
        super("Gingerbread", 2.1, 0.5);
        setUniqParam("������");
    }

    public Gingerbread(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("������");
    }
}
