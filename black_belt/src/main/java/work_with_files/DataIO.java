package work_with_files;

import java.io.*;

public class DataIO {
    public static void main(String[] args) {

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin")))
        {
            outputStream.writeBoolean(true);
            outputStream.writeByte(1);
            outputStream.writeDouble(12.5);
            outputStream.writeInt(500);
            outputStream.writeFloat(3.14F);
            outputStream.writeLong(3_000_000L);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readLong());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
