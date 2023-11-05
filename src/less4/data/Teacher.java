package less4.data;


import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic) {
        super(firstName, secondName, patronymic);
    }
    public Teacher(String firstName, String secondName, String patronymic, Long teacherId) {
        super(firstName, secondName, patronymic);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Преподаватель {" +
                "Id ='" + teacherId +'\'' +
                ", Фамилия ='" + super.getFirstName() + '\'' +
                ", Имя ='" + super.getSecondName() + '\'' +
                ", Отчество ='" + super.getPatronymic() + '\'' +
                '}';

    }
}