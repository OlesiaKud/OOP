package less6.dz.data;

import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;

    /*конструктор*/
    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }
    /*getters and setters*/
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /*переопредение метода toString()*/
    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    /*S – Single Responsibility (Принцип единственной ответственности)
    * Класс ответственен за выполнение 1 метода*/

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}