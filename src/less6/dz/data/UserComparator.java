package less6.dz.data;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    /*D — Dependency Inversion (Принцип инверсии зависимостей)
    Модули верхнего уровня не должны зависеть от модулей нижнего уровня, а должны зависеть от абстракций.
    Класс UserComparator принимает всех наследников класса User и использует интерфейс Comparator<T>,
    тем самым становится более абстрактным.
    */

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
