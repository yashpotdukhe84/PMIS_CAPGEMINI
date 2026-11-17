
abstract class PaymentGateway {

    // Concrete method
    void printReceipt() {
        System.out.println("Receipt generated.");
    }

    // Abstract method
    abstract void processPayment(double amount);
}

// Child class 1
class UPIPayment extends PaymentGateway {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI QR code.");
    }
}

// Child class 2
class CreditCardPayment extends PaymentGateway {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Card Swipe and OTP.");
    }
}

// Main class
public class abstraction {

    public static void main(String[] args) {

        // Cannot instantiate an abstract class directly
        // PaymentGateway p = new PaymentGateway();

        PaymentGateway payment = new UPIPayment();

        payment.processPayment(250.0);
        payment.printReceipt();
    }
}
