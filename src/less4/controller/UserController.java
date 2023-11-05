package less4.controller;

import less4.data.User;



public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic);
}