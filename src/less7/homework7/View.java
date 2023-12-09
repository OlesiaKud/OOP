package less7.homework7;

import less7.homework7.observer.*;

import java.util.Scanner;

public class View {
    Publisher calculator = new Calculator();
    public void getView() {
        System.out.println("Выберите математическое действие: \n 1 - сложение; \n 2 - вычитание; \n 3 - умножение; \n 4 - деление; \n 0 - выход.\n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
//        double a = 1.1;
//        double b = 2.2;
        double a = calculator.inputA();
        double b = calculator.inputB();
        double res = 0.0;
        switch (choice) {
            case 1:
                Observer plus = new Plus();
                plus.calc(a, b);
                getView();
                break;
            case 2:
                Observer minus = new Minus();
                minus.calc(a, b);
                getView();
                break;
            case 3:
                Observer multi = new Multi();
                multi.calc(a, b);
                getView();
                break;
            case 4:
                Observer divide = new Divide();
                divide.calc(a, b);
                getView();
                break;
            case 0:
                break;
            default:
                getView();
        }
    }
}
