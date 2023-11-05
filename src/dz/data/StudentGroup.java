package less3.dz.data;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup>{
    public StudentGroup(List<Student> studentList, List<Teacher> teacherList) {
        this.studentList = studentList;
        this.teacherList = teacherList;

    }

    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();

    /*getters*/
    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getCuratorList() {
        return teacherList;
    }
    /* добавление в список */
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }
    /*  toString*/
    @Override
    public String toString() {
        return "Группа: "
                + "Преподаватель " + teacherList +
                "Студенты: " + studentList;

    }
    /* сравнение*/
    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.studentList.size(), o.getStudentList().size());
    }
}
