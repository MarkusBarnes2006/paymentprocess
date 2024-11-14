public class CreditCardPayment implements payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment of " + amount + " processed");
        // System.out.printf("Credit card payment of %s processed\n", amount);
    }
}