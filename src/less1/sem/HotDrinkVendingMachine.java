package less1.sem;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinks;
    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks) {
            if (item.getName().equals(name))
                return item;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume)
                return drink;
        }
        return null;
    }
    public Product getProduct(String name, double volume, int temp ) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemp() == temp)
                return drink;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink) {
        this.hotDrinks.add(hotDrink);
    }

}
