package lambda.task1;

public class CheckStudents implements Check {

    @Override
    public boolean Check(Student student) {
        return student.getAvg() > 8;
    }
}
