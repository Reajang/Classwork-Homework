package Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {

    public static double method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        double num = scanner.nextDouble();
        scanner.close();
        if(num < 0) return ++num;
        else if(num > 0) return 2*num;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
