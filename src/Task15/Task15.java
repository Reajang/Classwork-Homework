package Task15;

import Task15.candies.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task15 {

    public static void main(String[] args) {
        //������
        Gift<Sweetness> gift1 = new Gift<Sweetness>();
        gift1.put(new Cake());
        Cake cake2 = new Cake("123", 10, 10.10);
        cake2.setUniqParam("��������� ����");
        gift1.put(cake2);
        gift1.put(new Toffee());
        gift1.put(new Marshmallow());
        gift1.put(new Lollipop());
        gift1.put(new Candy());
        gift1.getDescription();

        //��� ������ � �������
        Gift<Sweetness> gift2 = new Gift<Sweetness>();
        String s;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while(true) {
                System.out.println("��������: ");
                s = reader.readLine();
                if (s.equals("stop")) break;
                else if (s.equals("")) {
                    System.out.println("������ ������");
                    continue;
                }
                gift2.put(Shop.get(s));
            }
        }
        catch (Exception e){ }
        gift2.getDescription();
    }

}
/*
����������� ���������� �������.
�� ����� ��������� ��������� �������� (����� 7 �����)
� ������ �������� ���� ��������, ����, ���, ���������� ��������.
���������� ������� �������. ����� ��� �������, ����� ���������, �������  ��� � �������.
����� ������� ���������� ��������.

����������� �����, �.�. ������� ����� � ���� �������������� ������ ���� ���������� ����.
 */