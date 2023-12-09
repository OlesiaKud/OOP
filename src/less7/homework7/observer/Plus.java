package less7.homework7.observer;


public class Plus implements Observer {
    @Override
    public void calc(double a, double b) {
        double result = a + b;
        System.out.println("Сумма a + b= " + result);

    }
}
