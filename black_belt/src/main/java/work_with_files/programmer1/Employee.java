package work_with_files.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String department;
    transient private  int age;
    private Car car;

    public Employee(String name, String department, int age, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
