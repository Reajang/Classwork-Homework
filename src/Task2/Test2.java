package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

    public static String methodIf() throws IOException {
        //Нумерация месяцев с единицы
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Номер месяци с единицы IF ");
        int x = Integer.parseInt(reader.readLine());
        reader.close();
        if(x<1 || x>12) return "Не в диапазоне";
        else if(x>=3 && x<=5) return "Весна";
        else if(x>=6 && x<=8) return "Лето";
        else if (x>=9 && x <=11) return "Осень";
        else return "Зима";
    }
    public static String methodSwitch() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Номер месяци с единицы SW");
        int x = Integer.parseInt(reader.readLine());
        reader.close();
        switch (x){
            case 1:
            case 2:
            case 12:return "Зима";
            case 3:
            case 4:
            case 5: return "Весна";
            case 6:
            case 7:
            case 8: return "Лето";
            case 9:
            case 10:
            case 11: return "Осень";
            default: return "Не в диапазоне";
        }
    }

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println(methodIf());
                System.out.println(methodSwitch());
            }
        }
        catch (IOException e){

        }

    }
}
