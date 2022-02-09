package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {

        String privet = "Privet ";
        String text = "Some text. ";

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("test2.txt", true);
            fileWriter.write(text);
            fileWriter.write(privet);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }
}
