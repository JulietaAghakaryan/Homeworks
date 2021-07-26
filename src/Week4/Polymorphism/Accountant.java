package Week4.Polymorphism;

public class Accountant implements Staff {
    @Override
    public void work() {
        System.out.println("Preparing accounts and tax returns. " +
                "Monitoring spending and budgets. " +
                "Auditing and analysing financial performance." +
                " Financial forecasting and risk analysis." +
                " Advising on how to reduce costs and increase profits.");
    }
}
