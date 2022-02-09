package lambda.task1;

import java.util.ArrayList;

public class StudentInfo {

    public static void main(String[] args) {
        Student student1 = new Student("Alex", 'm', 30, 4, 9.6);
        Student student2 = new Student("Kirill", 'm', 25, 2, 2.3);
        Student student3 = new Student("Olga", 'w', 19, 1, 6.8);
        Student student4 = new Student("Irina", 'w', 23, 3, 7.5);
        Student student5 = new Student("Ivan", 'm', 54, 5, 6.1);
        Student student6 = new Student("Anna", 'w', 27, 4, 8.8);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        Info info = new Info();


    }
}

