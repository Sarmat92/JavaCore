package lambda.task1;

public class Student {

    private String name;
    private char sex;
    private Integer age;
    private Integer course;
    private Double avg;

    public Student(String name, char sex, Integer age, Integer course, Double avg) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", avg=" + avg +
                '}';
    }
}
