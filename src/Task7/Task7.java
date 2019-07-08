package Task7;

import java.util.Scanner;

public class Task7 {

    public static String method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        double min = scanner.nextDouble();
        double res = min%5;
        if(res>=0 && res <3) return "Зеленый";
        else if(res >=3 && res <4) return "Желтый";
        else return "Красный";
    }

    public static void main(String[] args) {
        while (true) System.out.println(method());

    }
}
