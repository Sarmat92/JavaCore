package work_with_files;

import java.io.*;

public class CopyExample2 {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream ("/home/father/Изображения/pictures.png");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
             FileOutputStream fileOutputStream = new FileOutputStream("pictures.png");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream))

        {
            int pictures;
            while ((pictures = fileInputStream.read())!=1){
                fileOutputStream.write(pictures);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
