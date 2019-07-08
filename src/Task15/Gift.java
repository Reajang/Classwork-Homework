package Task15;

import java.util.ArrayList;

public class Gift<T extends Sweetness> {
    private ArrayList<T> giftList = new ArrayList<>();

    public Gift() {
    }

    public Gift(ArrayList<T> giftList) {
        this.giftList = giftList;
    }

    public void getDescription(){
        System.out.format("���: %.2f\n���������: %.2f\n%s", getWeight(), getCost(), this.toString());
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("������� ������� ��:\n");
        for(T gift : giftList){
            builder.append("\n{ " + gift.getName() + ". ��������: " + gift.getUniqParam() + " }\n");
        }
        return builder.toString();
    }

    public double getWeight(){
        double res = 0;
        for(T gift : giftList){
            res+=gift.getWeight();
        }
        return res;
    }

    public double getCost(){
        double res = 0;
        for(T gift : giftList){
            res+=gift.getPrice();
        }
        return res;
    }

    public void put(T gift){
        giftList.add(gift);
    }
    public void remove(T gift){
        giftList.remove(gift);
    }
}
