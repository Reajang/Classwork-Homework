package Task10;

import java.io.*;
import java.util.ArrayList;

public class Task10 {

    public static void method(File file) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Содержимое файла :");
        while(fileReader.ready()){
            list.add(fileReader.readLine());

            System.out.println(list.get(list.size()-1));
        }
        fileReader.close();
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter(file);
        for(int i = 0; i< list.size(); i++){
            System.out.println("Ввести строку :");
            writer.write(consoleReader.readLine());
            writer.write("\n");
        }
        consoleReader.close();
        writer.close();
    }

    public static void main(String[] args) {
        try{
            method(new File("C:\\Users\\Student\\Desktop\\file.txt"));
        }
        catch (IOException e){

        }
    }
}
