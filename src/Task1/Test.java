package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(method1());
        }
        catch (IOException e){

        }
    }

    public static Number method1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n1, n2;
        System.out.println("One: ");
        n1 = Double.parseDouble(reader.readLine());
        System.out.println("Two: ");
        n2 = Double.parseDouble(reader.readLine());
        reader.close();
        if(Math.abs(10-n1) > Math.abs(10-n2)) return n2;
        else return n1;
    }
}
