package less2.dz2;

public interface ActorBehaviour {
    void setTakeExam(boolean isTakeExam); // взял билет, еще не отвечал

    void setPassExam(boolean isPassExam); // сдал экзамен

    boolean isTakeExam();

    boolean isPassExam();

}
