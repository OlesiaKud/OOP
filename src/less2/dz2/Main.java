package less2.dz2;

public class Main {
    public static void main(String[] args) {
        Exam examMath = new Exam();
        Student student1 = new Student("Иванов");
        Student student2 = new Student("Петров");
//        Student student3 = new Student("Сидоров");
//        Student student4 = new Student("Сыроежкин");
        examMath.acceptToUniversity(student1);
        examMath.acceptToUniversity(student2);
//        examMath.acceptToUniversity(student3);
//        examMath.acceptToUniversity(student4);
        examMath.update();
    }
}
