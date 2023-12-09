package less7.homework7;


import less7.homework7.observer.Calculator;
import less7.homework7.observer.Publisher;

public class Main {
    public static void main(String[] args) {
        Publisher calculator = new Calculator();

        View view = new View();
        view.getView();

    }
}
