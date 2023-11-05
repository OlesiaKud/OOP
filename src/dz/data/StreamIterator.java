package less3.dz.data;

import java.util.List;

//public class StreamIterator implements Iterator<StudentGroup>{
//
//    private int counter;
//    private final List<StudentGroup> stream;
//
//
//    public StreamIterator(int counter, List<StudentGroup> stream) {
//        this.counter = counter;
//        this.stream = stream;
//    }
//}

import java.util.Iterator;

public class StreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> studentGroupList;
    private int counter;
//    переопределяем hasNext
    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }
    //    переопределяем next
    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        else {
            return studentGroupList.get(counter++);
        }
    }
    public void zeroCount () {  // обнуляем counter
        counter = 0;
    }

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentGroups();
        zeroCount();
    }
}