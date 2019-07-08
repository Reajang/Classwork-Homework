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
        this.uniqParam = "������ ����������.";
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
����������� ���������� �������.
�� ����� ��������� ��������� �������� (����� 7 �����)
� ������ �������� ���� ��������, ����, ���, ���������� ��������.
���������� ������� �������. ����� ��� �������, ����� ���������, �������  ��� � �������.
����� �������  ��������.
 */