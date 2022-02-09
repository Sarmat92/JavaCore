package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        fileReader = new FileReader("test2.txt");
        int character;
        while ((character = fileReader.read()) !=-1){
            System.out.print((char) character);
        }
        System.out.println();
        System.out.println("Done!");

        fileReader.close();
    }
}
