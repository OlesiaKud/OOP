package less6.dz.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    /*O — Open-Closed (Принцип открытости-закрытости)
     * класс Student наследник класса User.  Он расширяет класс потомка, добавляя новое поле private Long studentId;
     * увеличение функционала идет за счет расширения, а не за счет модификации класса User
     * */
    private Long studentId;


    /*конструктор*/
    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    /*перегрузка с указанием studentId*/

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    /*getters and setters*/
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }



    /*переопредение метода toString()*/
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }


    /*S – Single Responsibility (Принцип единственной ответственности)
     * один класс отвечает только за 1 операцию, реализовано сравнение.
     * */

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}