package Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {

    public static int method() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Число в двоичном формате: ");
        String[] arrBin = reader.readLine().split("");
        reader.close();
        int res = 0;
        for(int i = arrBin.length-1, j=0; i>=0 ; i--, j++) {
            if (arrBin[i].equals("1")) res += myPow(2, j);
            else if(arrBin[i].equals("0")) continue;
            else {
                System.out.println("Неверный формат.");
                return -1;
            }
        }
        return res;
    }
    public static int myPow(int x, int n){
        int res = 1;
        for(int i = 0; i< n; i++){
            res*=x;
        }
        return res;
    }

    public static void main(String[] args) {
        try{

            System.out.println(method());
        }
        catch (IOException e){

        }
    }
}
