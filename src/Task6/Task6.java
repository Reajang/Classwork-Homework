package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task6 {

    public static void method()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Числа через пробел: ");
        String[] arrSt = reader.readLine().split(" ");
        ArrayList<Double> list = new ArrayList<>();
        for(String st : arrSt){
            list.add(Double.parseDouble(st));
        }
        Collections.sort(list);
        System.out.print(list + " : ");
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        try{
            method();
        }
        catch (IOException e){

        }
    }
}
