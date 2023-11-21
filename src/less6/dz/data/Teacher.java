package less6.dz.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;
    /*O — Open-Closed (Принцип открытости-закрытости)
     * класс Teacher наследник класса User.  Он расширяет класс потомка, добавляя новое поле private Long teacherId
     * */

    /*конструктор*/
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    /*getters and setters*/
    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /*S – Single Responsibility (Принцип единственной ответственности)
    * один класс отвечает только за 1 операцию, реализовано сравнение.
    * */
    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}