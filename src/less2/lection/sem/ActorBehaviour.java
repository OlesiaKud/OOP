package less2.lection.sem;

public interface ActorBehaviour {
    void setMakeOrder(boolean isMakeOrder);
    void setTakeOrder(boolean pickUpOrder);// takeOrder
    boolean isMakeOrder();
    boolean isTakeOrder();
}