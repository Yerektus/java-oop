package practice4.problem3;

public class IPhone implements SellableAndPluggable {
    @Override
    public void sell() { System.out.println("iPhone: sell()"); }
    @Override
    public void plug() { System.out.println("iPhone: plug()"); }
}
