package Task15;

import Task15.candies.*;

public class Shop {

    public static Sweetness get(String string){
        switch (string){
            case "Candy": return new Candy();
            case "Biscuit": return new Biscuit();
            case "Cake": return new Cake();
            case "Gingerbread": return new Gingerbread();
            case "Lollipop": return new Lollipop();
            case "Marshmallow": return new Marshmallow();
            case "Toffee": return new Toffee();
            default: return new EtCetera();
        }
    }
}
