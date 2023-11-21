package less6.dz.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    /*D — Dependency Inversion (Принцип инверсии зависимостей)
    Модули верхнего уровня не должны зависеть от модулей нижнего уровня, а должны зависеть от абстракций.
    Класс StudentGroupIterator (модуль нижнего уровня)использует интерфейс Iterator,
    принимает список студентов(модуль высшего уровня), интерфейс устанавливает связь между этими 2 классами.
    */
    private int counter;
    private final List<Student> students;

    /*конструктор*/
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }
    /*S – Single Responsibility (Принцип единственной ответственности)
     * Класс ответственен за выполнение 1 метода*/
    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}