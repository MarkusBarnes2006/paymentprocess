public class PayPalPayment implements payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pay pal payment of " + amount + " processed");
        // System.out.printf("Credit card payment of %s processed\n", amount);
    }
}