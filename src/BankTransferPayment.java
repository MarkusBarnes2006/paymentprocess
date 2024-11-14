public class BankTransferPayment implements payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Bank transfer payment of " + amount + " processed");
        // System.out.printf("Credit card payment of %s processed\n", amount);
    }
}