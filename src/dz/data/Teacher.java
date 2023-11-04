package less3.dz.data;


import less3.dz.data.User;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
    }
    // Getters and setters
    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    // сравнение
    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
    // toString
    @Override
    public String toString() {
        return "Преподаватель:" +
//                "Id: '" + teacherId +'\'' +                 /* уменьшаем, чтобы компактнее выводились данные*/
                ", Фамилия: '" + super.getFirstName() + '\'' +
                ", Имя: '" + super.getSecondName() + '\'' +
                '}';
    }
}
