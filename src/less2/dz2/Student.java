package less2.dz2;

public class Student extends Actor{
    public Student(String lastName) {
        super(lastName);
    }

    @Override
    public String getLastName() {
        return super.lastName;
    }

    @Override
    public void setTakeExam(boolean takeExam) {
        super.isTakeExam = takeExam;

    }

    @Override
    public void setPassExam(boolean passExam) {
        super.isPassExam = passExam;

    }

    @Override
    public boolean isTakeExam() {
        return super.isTakeExam;
    }

    @Override
    public boolean isPassExam() {
        return super.isPassExam;
    }
}
