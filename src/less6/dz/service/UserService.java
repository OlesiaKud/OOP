package less6.dz.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    /*I — Interface Segregation (Принцип разделения интерфейсов)
    * интерфейс выполняет 1 действие create
    * */
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}