package Task14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            try {
                System.out.println("����������� �������: ");
                String[] strings = new String[Integer.parseInt(reader.readLine())];

                for(int i =0; i<strings.length;i++){
                    System.out.println("������: ");
                    strings[i] = reader.readLine();
                }
                System.out.println("������: " + Arrays.toString(strings));
                String min="", max="";
                for(String st : strings){

                    if(st.length()>max.length()){
                        max = st;
                        if(min.equals("")) min = max;
                    }
                    else if(st.length()<min.length()) min = st;
                }
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);

                break;
            } catch (Exception e) {
                System.out.println("�������� ������.");
            }

        }

    }

}
/*
����� ������������� �������� � �������.
�������� ������ �����. ����������� ������� �������� �������������.
� ���������� ������� ���������� ����� ����� ������� � ����� �������� �����, ������� ��� � �������.
 */