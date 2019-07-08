package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task5 {

    public static void method() throws IOException {
        Scanner scanner = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;
        System.out.println("a: ");
        a = scanner.nextDouble();
        //a = Double.parseDouble(reader.readLine());
        System.out.println("b: ");
        b = scanner.nextDouble();
        //b = Double.parseDouble(reader.readLine());
        System.out.println("c: ");
        c = scanner.nextDouble();
        //c = Double.parseDouble(reader.readLine());
        scanner.close();
        //reader.close();
        if (a+b >c && a+c > b && b+c>a) System.out.println("Треугольник существует");
        else System.out.println("Треугольник не существует");
    }

    public static void main(String[] args) {
        try {
            method();
        }
        catch (IOException e){

        }
    }
}
