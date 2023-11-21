package less6.dz;

import less6.dz.controller.StudentController;
import less6.dz.controller.UserController;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Petrov", "Oleg", "Petrovich", 2000, 1, 1);
//        studentController.create("Smirnov", "Petr", "Cergeevich", 2000, 2, 1);
//        studentController.create("Popov", "Sergei", "Ivanovich", 2000,11,11);
//        studentController.create("Sidorov", "Alexei", "Petrovich", 2000,10,10);

        /*L — Liskov Substitution (Принцип подстановки Барбары Лисков)
        класс-родитель(User) и класс-потомок(Student) могут использоваться одинаковым образом без нарушения работы программы.
//        */
        UserController userController = new StudentController();
        userController.create("Popov", "Sergei", "Ivanovich", 2000,11,11);




    }
}
