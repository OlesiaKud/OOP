package less4.controller;

import less4.data.Student;
import less4.data.Teacher;
import less4.service.StudentGroupService;
import less4.service.StudentService;
import less4.view.StudentView;


import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic) {
        dataService.create(firstName, secondName, patronymic);
        studentView.sendOnConsole(dataService.getAll());
    }
    public List<Student> getAllStudents(){
        return dataService.getAll();
    }
    public void printAllStudent(){
        studentView.sendOnConsole(getAllStudents());
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}