package less2.dz2;


public abstract class Actor implements ActorBehaviour {
    protected final String lastName;

    protected boolean isTakeExam ;
    protected boolean isPassExam;

    public Actor(String lastName) {
        this.lastName = lastName;
    }
    public abstract String getLastName();
}

