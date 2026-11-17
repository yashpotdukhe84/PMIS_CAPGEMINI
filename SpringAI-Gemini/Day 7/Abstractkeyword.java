
abstract class Payment {

    abstract void pay(double amount);

    void printReceipt() {
        System.out.println("Payment receipt generated.");
    }
}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class CreditCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

public class Abstractkeyword {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay(500);
        p1.printReceipt();

        Payment p2 = new CreditCard();
        p2.pay(1000);
        p2.printReceipt();
    }
}
