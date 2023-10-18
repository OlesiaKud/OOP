package less2.lection.sem;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Петр");
        Human human2 = new Human("Олег");
        Human human3 = new Human("Семен");
        Human human4 = new Human("Фёдор");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
    }
}