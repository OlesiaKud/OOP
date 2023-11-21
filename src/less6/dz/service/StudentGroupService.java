package less6.dz.service;



import less6.dz.data.Student;
import less6.dz.data.UserComparator;
import less6.dz.data.StudentGroup;
import less6.dz.data.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }



    public Student getStudentFromStudentGroup(String firstName, String secondName){

        /*D — Dependency Inversion (Принцип инверсии зависимостей)
        Модули верхнего уровня не должны зависеть от модулей нижнего уровня, а должны зависеть от абстракций.
        Класс StudentGroupService (модуль нижнего уровня)использует интерфейс Iterator,
        принимает список студентов(модуль высшего уровня), интерфейс устанавливает связь между этими 2 классами.
        */
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Student> getSortedStudentGroup(){

        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){

        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
