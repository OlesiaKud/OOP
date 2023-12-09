package less7.homework7.observer;

public class Minus implements Observer {
    @Override
    public void calc(double a, double b) {
        double result = a - b;
        System.out.println("Разность a - b = " + result);
    }
}
