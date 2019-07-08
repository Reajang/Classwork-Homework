package Task15;

public abstract class Sweetness {
    private String name;
    private double price;
    private double weight;
    private String uniqParam;

    public Sweetness(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.uniqParam = "Нечего особенного.";
    }

    public void setUniqParam(String uniqParam) {
        this.uniqParam = uniqParam;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getUniqParam() {
        return uniqParam;
    }
}
/*
Формируется новогодний подарок.
Он может содержать различные сладости (более 7 видов)
У каждой сладости есть название, цена, вес, уникальный параметр.
Необходимо собрать подарок. Найти вес подарка, общую стоимость, вывести  инф в консоль.
Класс Подарок  ДЖенерик.
 */