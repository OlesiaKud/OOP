package less2.dz2;
import java.util.List;

public interface UniBehaviour {
        void acceptToUniversity(Actor actor);
        void releaseFromUniversity(List<Actor> actors);
        void update();
}
