package less5.data;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + studentId +
                ", Имя ='" + super.getFirstName() + '\'' +
                ", Фамилия ='" + super.getSecondName() + '\'' +
                ", Отчество ='" + super.getLastName() + '\'' +
                '}';
    }
//    public void makeStudentList(int studentId) {
//        List<Student> studentList = new ArrayList<>();
//        if (studentId = Student.getStudentId
//        studentList.add(stu);
//    }
}
