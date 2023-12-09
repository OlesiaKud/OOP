package less7.homework7.observer;

import less7.homework7.observer.Observer;
import less7.homework7.observer.Publisher;

import java.util.Locale;
import java.util.Scanner;

public class Calculator implements Publisher {


    @Override
    public double inputA() {
        System.out.println("Введите а (используйте <.>):");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double a = scan.nextDouble();
        scan.close();
        return a;
    }

    @Override
    public double inputB() {
        System.out.println("Введите b (используйте <.>): ");
        Scanner iscan = new Scanner(System.in);
        iscan.useLocale( Locale.US );
        double b = iscan.nextDouble();
        iscan.close();
        return b;

    }
    @Override
    public void getResult(double a, double b, Observer observer) {
        observer.calc(a, b);
    }
}
