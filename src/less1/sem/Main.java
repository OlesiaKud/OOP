package less1.sem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWater b1 = new BottleOfWater("1", 1, 1);
        BottleOfWater b2 = new BottleOfWater("2", 2, 2);
//        BottleOfWater b3 = new BottleOfWater("5", 4, 3);
//        BottleOfWater b4 = new BottleOfWater("15", 123, 1);
//        BottleOfWater b5 = new BottleOfWater("20", 6, 5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
//        vendingMachine.addBottleOfWater(b3);
//        vendingMachine.addBottleOfWater(b4);
//        vendingMachine.addBottleOfWater(b5);
//        System.out.println(vendingMachine.getProduct("20", 5));
//        System.out.println(vendingMachine.getProduct("20", 100));
        for (BottleOfWater b : vendingMachine.getBottleOfWaters()) {
            System.out.println(b);
        }

        HotDrink hd1 = new HotDrink("Green tea", 100, 0.3, 90);
        HotDrink hd2 = new HotDrink("Espresso", 200, 0.2, 90);
        HotDrink hd3 = new HotDrink("Latte ", 250, 0.3, 80);
        HotDrink hd4 = new HotDrink("Cappuccino", 200, 0.4, 85);
        HotDrink hd5 = new HotDrink("Mocha latte", 220, 0.3, 90);
        HotDrink hd6 = new HotDrink("Oolong", 150, 0.5, 85);
        HotDrink hd7 = new HotDrink("Masala chai ", 180, 1, 90);

        HotDrinkVendingMachine hotDrinkMachine = new HotDrinkVendingMachine(new ArrayList<>());
        hotDrinkMachine.addHotDrink(hd1);
        hotDrinkMachine.addHotDrink(hd2);
        hotDrinkMachine.addHotDrink(hd3);
        hotDrinkMachine.addHotDrink(hd4);
        hotDrinkMachine.addHotDrink(hd5);
        hotDrinkMachine.addHotDrink(hd6);
        hotDrinkMachine.addHotDrink(hd7);
        for (HotDrink hd : hotDrinkMachine.getHotDrinks()) {
            System.out.println(hd);
        }




    }

}