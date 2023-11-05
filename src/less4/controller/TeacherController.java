package less4.controller;


import less4.data.Teacher;
import less4.service.TeacherService;
import less4.view.TeacherView;

import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic) {
        teacherService.create(firstName, secondName, patronymic);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAll();
    }

    public void printAllStudent() {
        teacherView.sendOnConsole(getAllTeachers());

    }
}
