package less3.dz;

import less3.dz.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // создаем студентов и преподавателй и формируем группы

        List<Student> group1 = new ArrayList<>();
        List<Student> group2 = new ArrayList<>();
        List<Student> group3 = new ArrayList<>();

        Student student11 = new Student("Иванов", "Иван");
        Student student12 = new Student("Петров", "Петр");
        Student student13 = new Student("Смирнов", "Сергей");
        Student student14 = new Student("Попов", "Михаил");
        Student student15 = new Student("Жуков", "Степан");

        group1.add(student11);
        group1.add(student12);
        group1.add(student13);
        group1.add(student14);
        group1.add(student15);

        Student student21 = new Student("2Иванов", "Иван");
        Student student22 = new Student("2Петров", "Петр");
        Student student23 = new Student("2Смирнов", "Сергей");
        group2.add(student21);
        group2.add(student22);
        group2.add(student23);

        Student student31 = new Student("3Смирнов", "Иван");
        Student student32 = new Student("3Петров", "Петр");
        group3.add(student31);
        group3.add(student32);


        Teacher teacher11 = new Teacher("Ломоносов", "Степан");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher11);


        StudentGroup studentGroup1 = new StudentGroup(group1, teacherList);
        StudentGroup studentGroup2 = new StudentGroup(group2, teacherList);
        StudentGroup studentGroup3 = new StudentGroup(group3, teacherList);


        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(studentGroup1); /* 5 студентов*/
        studentGroups.add(studentGroup2); /* 3 студентов*/
        studentGroups.add(studentGroup3); /* 2 студентов*/

        studentGroups.sort(new StreamComparator());

        // первоначальный список
        for (StudentGroup group : studentGroups) {
            System.out.println("В группе студентов: " + group.getStudentList().size());
        }
        // сортировка
        Collections.sort(studentGroups);
        for (StudentGroup group : studentGroups) {
            System.out.println("В группе студентов: " + group.getStudentList().size());
        }

        Stream stream = new Stream(studentGroups);
        for (StudentGroup studentGroup : stream) {
            System.out.println(studentGroup);
        }
    }
}
