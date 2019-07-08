package Task15.candies;

import Task15.Sweetness;

public class Candy extends Sweetness {
    public Candy() {
        super("Candy", 1.5, 0.34);
        setUniqParam("Что-то о конфетах");
    }

    public Candy(String name, double price, double weight) {
        super(name, price, weight);
        setUniqParam("Что-то о конфетах");
    }
}
