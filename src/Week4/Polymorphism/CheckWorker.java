package Week4.Polymorphism;

public class CheckWorker {
    public static void main(String[] args) {
        Staff cashier = new Cashier();
        Staff accountant = new Accountant();
        Staff programmer = new Programmer();

        cashier.work();
        accountant.work();
        programmer.work();
    }
}
