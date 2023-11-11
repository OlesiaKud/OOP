package less5.data;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", Имя ='" + super.getFirstName() + '\'' +
                ", Фамилия ='" + super.getSecondName() + '\'' +
                ", Отчество ='" + super.getLastName() + '\'' +
                '}';
    }
}