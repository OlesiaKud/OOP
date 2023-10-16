package less1.sem;

public class HotDrink extends BottleOfWater{
    private Integer temp;

    public HotDrink(String name, double cost, double volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Hot Drink {" +
                "name = " + super.getName() +
                "; volume = " + super.getVolume() +
                "; temp = " + temp +
                "; cost = " + super.getCost() +
                '}';
    }
}
