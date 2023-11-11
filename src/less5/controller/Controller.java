package less5.controller;

import less5.data.*;
import less5.service.DataService;
import less5.service.StudyGroupService;
import less5.view.StudentView;
import less5.view.StudyGroupView;
import less5.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    /* код из семинарского занятия*/
    private final DataService service = new DataService();
    private final StudyGroupService groupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView= new TeacherView();
    private final StudyGroupView groupView = new StudyGroupView();


    public void createStudent(String firstName, String secondName,
                              String lastName){
        service.create(firstName,secondName,lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName,
                              String lastName){
        service.create(firstName,secondName,lastName, Type.TEACHER);
    }



    /*получение списка студентов (их id) и преподавателей (их id)*/
    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public void getAllTeacher(){
        List<User> userList = service.getAllTeachers();
        for (User user: userList){
            teacherView.printOnConsole((Teacher) user);
        }
    }
    /*формирование учебной группы, путём вызова метода из сервиса;*/
//    public void createStudyGroup (List<Student> studentList, List<Teacher> teacherList){
//        List <StudyGroup>groupList = new ArrayList<>();
//        groupService.createStudyGroup(studentList, teacherList);
//        groupView.printOnConsole((StudyGroup) groupList);
//
//    }


    public void createStudyGroup1 (List<Student> studentList, Teacher teacher){
        List <StudyGroup>groupList = groupService.createStudyGroup(studentList, teacher);
        for (StudyGroup studyGroup: groupList){
            groupView.printOnConsole((StudyGroup) groupList);
        }
    }

}
