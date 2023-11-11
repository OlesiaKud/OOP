package less5.service;

import less5.data.*;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private StudyGroup studyGroup;
    private Teacher teacher;


    /*конструктор*/

    public StudyGroupService() {
        this.teacher = teacher;
        this.studentList = studentList;
        this.studyGroup = studyGroup;
    }

    /* getters and setters*/


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /*создаем списки учителей и студентов*/
    public void createStudentList(String firstName, String secondName, String lastName, int id) {
        Student student = new Student(firstName, secondName, lastName, id);
        studentList.add(student);
    }

    public List<StudyGroup> createStudyGroup(List<Student> studentList, Teacher teacher) {
        List stGroup = new ArrayList<>();
        stGroup.add(studentList);
        stGroup.add(teacher);


        return null;
    }

}

