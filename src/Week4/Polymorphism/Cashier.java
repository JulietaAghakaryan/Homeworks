package Week4.Polymorphism;

public class Cashier implements Staff {
    @Override
    public void work() {
        System.out.println("A Cashier's primary role is to assist customers" +
                " in the in-store check-out process");
    }
}
