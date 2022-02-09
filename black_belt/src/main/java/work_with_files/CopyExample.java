package work_with_files;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {

//            int character;
//            while ((character = reader.read()) != -1) { //reader читает
//                writer.write(character);                //writer записывает
//            }

            String line;
            while ((line = reader.readLine()) != null){ //reader читает строку, пока есть что читать
                writer.write(line);                     //writer записывает
            }

                System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
