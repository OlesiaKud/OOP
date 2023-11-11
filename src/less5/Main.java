package less5;
import less5.controller.Controller;
import less5.data.Student;
import less5.data.StudyGroup;
import less5.data.Teacher;
import less5.service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        StudyGroupService service = new StudyGroupService();

        /*из семинарского занятия
        controller.createStudent("Иванов", "Иван", "Иванович");
        controller.createStudent("Петров", "Петр", "Петрович");
        controller.createStudent("Петров", "Петр", "Петрович");
//      controller.createStudent("Сергеев", "Сергей", "Сергеевич");
        controller.getAllStudent();
        controller.createTeacher("Юрьев", "Юрий", "1");
        controller.createTeacher("Семёнов", "Семён", "2");
        controller.getAllTeacher();
        */



//        service.createStudentList("Иванов", "Иван", "Иванович",1);
//        service.createStudentList("2", "2", "2", 2);
        Student s1 = new Student("Иванов", "Иван", "Иванович",1);
        Student s2 = new Student("Петров", "Петр", "Петрович", 2);
        List<Student> group1 = new ArrayList<>();
        group1.add(s1);
        group1.add(s2);
        Teacher t1 = new Teacher("Юрьев", "Юрий", "Юрьевич", 11);

        controller.createStudyGroup1(group1, t1);

    }
}
