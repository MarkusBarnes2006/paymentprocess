public class Main {
    public static void main(String[] args) {
        payment CreditCard = new CreditCardPayment();
        payment PayPal = new PayPalPayment();
        payment BankTransfer = new BankTransferPayment();


        processPayment(CreditCard, 150.0);
        processPayment(PayPal, 200.0);
        processPayment(BankTransfer, 1000.0);

    }

    public static void processPayment(payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}

