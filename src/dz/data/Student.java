package less3.dz.data;


import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public Student(String firstName, String secondName, Long studentId) {
        super(firstName, secondName);
        this.studentId = studentId;
    }
    /*getters and setters */
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /*toString*/
    @Override
    public String toString() {
        return "Студент {" +
//                "Id: '" + studentId +'\'' +
                ", Фамилия: '" + super.getFirstName() + '\'' +
                ", Имя: '" + super.getSecondName() + '\'' +
                '}';
    }
    /* сравнение */
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
