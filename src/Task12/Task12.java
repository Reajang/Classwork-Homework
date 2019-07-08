package Task12;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for(int i = 0; i<arr.length; i++){
            arr[i] = random.nextInt(20)-10;
        }
        System.out.println(Arrays.toString(arr));
        int max = -10;
        int imax = 0;
        int min = 10;
        int imin = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>= max){
                imax = i;
                max = arr[i];
            }
            else if(arr[i] <= min){
                imin = i;
                min = arr[i];
            }
        }
        arr[imin] = max;
        arr[imax] = min;
        System.out.println(Arrays.toString(arr));
    }

}
