package less3.dz.data;

import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void addStudentGroups(List<StudentGroup> studentGroup) {
        studentGroups.add((StudentGroup) studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    /* toString*/
    @Override
    public String toString() {
        return "Поток:" +
                " Группа: " + studentGroups;
    }
}