package less5.data;

import java.util.List;

public class StudyGroup {
    private List<Student> studentList;
    private Teacher teacher;

    public StudyGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }



    @Override
    public String toString() {
        return "StudyGroup{" +
                ", teacher=" + teacher.getTeacherId() +
                "studentList=" + studentList +
                '}';
    }
}
