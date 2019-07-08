package Task8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void method() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("C:\\Users\\Student\\Desktop\\file.txt");
        String string = reader.readLine();
        while(!string.equals("exit")){
            writer.write(string);
            writer.write("\n");
            //writer.flush();
            string = reader.readLine();
        }
        writer.close();
        reader.close();
    }

    public static void main(String[] args) {
        try {
            method();
        }
        catch (IOException e){

        }
    }
}
