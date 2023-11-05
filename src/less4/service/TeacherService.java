package less4.service;

import less4.data.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherService  implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic) {
        Long countMaxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > countMaxId) {
                countMaxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, secondName, patronymic, ++countMaxId);
        teachers.add(teacher);
    }


}
