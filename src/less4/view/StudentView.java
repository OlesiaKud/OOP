package less4.view;

import less4.data.Student;
import less4.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{
    //    код из семинарского занятия
    @Override
    public void sendOnConsole(List<Student> studentListlist) {
        for (Student student:studentListlist) {
            System.out.println(student);
        }
    }
    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        System.out.println(studentGroup);;
    }

//    из репозитория
//    Logger logger = Logger.getLogger(StudentView.class.getName());
//
//    @Override
//    public void sendOnConsole(List<Student> students) {
//        for(Student user: students){
//            logger.info(user.toString());
//        }
//    }
//
//    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
//        logger.info(studentGroup.toString());
//    }

}