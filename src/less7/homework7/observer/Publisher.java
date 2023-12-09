package less7.homework7.observer;

import less7.homework7.observer.Observer;

public interface Publisher {
    double inputA();

    double inputB();
    void getResult(double a, double b, Observer observer);
}
