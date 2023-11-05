package less4;

import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.data.Student;
import less4.data.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Petrov", "Oleg", "Petrovich");
        studentController.create("Smirnov", "Petr", "Cergeevich");
//        studentController.create("Popov", "Sergei", "Ivanovich");
//        studentController.create("Sidorov", "Alexei", "Petrovich");
        studentController.getAllStudents();

        TeacherController teacherController = new TeacherController();
        teacherController.create("Pushkin", "Alexander", "Sergeevich");
        teacherController.create("Lermontov","Michail", "Yurevich");
//        teacherController.getAllTeachers();
        teacherController.printAllTeachers();
    }
}
