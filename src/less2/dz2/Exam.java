package less2.dz2;

import java.util.ArrayList;
import java.util.List;

public class Exam implements AuditoriumBehaviour, UniBehaviour{
    private final List<Actor> auditorium;

    public Exam() {
        this.auditorium = new ArrayList<>();
    }

    @Override
    public void acceptToUniversity(Actor actor) {
        System.out.println(actor.getLastName() + " пришел в университет.");
        takeExam(actor);

    }

    @Override
    public void takeExam(Actor actor) {
        System.out.println(actor.getLastName() + " взял экзаменационный билет.");
        actor.setTakeExam(true);
        this.auditorium.add(actor);

    }

    @Override
    public void answerExam() {
        for( Actor actor: auditorium){
            if (!actor.isPassExam){
                actor.setPassExam(true);
                System.out.println(actor.getLastName() + " ответил.");
            }
        }
    }

    @Override
    public void passExam() {
        for( Actor actor: auditorium){
            if (actor.isPassExam){
                actor.setPassExam(true);
                System.out.println(actor.getLastName() + " сдал экзамен и может быть свободен");
            }
        }
    }

    @Override
    public void releaseAuditorium() {
        List<Actor> actorList = new ArrayList<>();
        for( Actor actor: auditorium){
            if(actor.isPassExam()){
                actorList.add(actor);
                System.out.println(actor.getLastName() + " покинул аудиторию.");
            }
        }
        releaseFromUniversity(actorList);
    }

    @Override
    public void releaseFromUniversity(List<Actor> actorList) {
        for(Actor actor : actorList){
            System.out.println(actor.getLastName() + " вышел из университета.");
            auditorium.remove(actor);
        }
    }

    @Override
    public void update() {
        answerExam();
        passExam();
        releaseAuditorium();

    }
}
