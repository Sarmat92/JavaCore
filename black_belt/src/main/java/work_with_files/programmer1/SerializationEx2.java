package work_with_files.programmer1;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {

        Car car = new Car("Nissan Primera", "Black");
        Employee employee = new Employee("Irina", "IT", 28, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin")))
        {
            outputStream.writeObject(employee);
            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
