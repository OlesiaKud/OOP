package less6.dz.controller;

import less6.dz.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    /*I — Interface Segregation (Принцип разделения интерфейсов)
     * интерфейс выполняет 1 действие create
     * */

    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}