package Task4;

import java.util.Scanner;

public class Task4 {
    static int i;
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int x = scanner.nextInt();
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        System.out.println(x + " * " + ++i + " = " + x*i);
        scanner.close();
    }
    public static void main(String[] args) {
        method();
    }
}
