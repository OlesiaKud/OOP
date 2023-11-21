package less6.dz.view;

import less6.dz.data.User;

import java.util.List;

public interface UserView<T extends User>{
    /*I — Interface Segregation (Принцип разделения интерфейсов)
     * интерфейс выполняет 1 действие sendOnConsole
     * */
    void sendOnConsole(List<T> list);
}