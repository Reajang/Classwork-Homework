package Task9;

import java.io.*;

public class Task9 {

    public static void method(File file) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        while(fileReader.ready()){
            System.out.println(fileReader.readLine());
        }
        fileReader.close();
    }

    public static void main(String[] args) {
        try{
            method(new File("C:\\Users\\Student\\Desktop\\file.txt"));
        }
        catch (IOException e){}
    }
}
