class CoffeeWallet {

    String name;
    double balance;

    // Constructor
    CoffeeWallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Add funds
    void addFunds(double amount) {
        balance = balance + amount;
        System.out.println("Added: ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Purchase
    void purchase(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Purchase: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Account overview
    void accountOverview() {
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class CoffeeWalletDemo {

    public static void main(String[] args) {

        CoffeeWallet student = new CoffeeWallet("Yash", 500);

        student.accountOverview();

        student.addFunds(200);

        student.purchase(150);

        student.purchase(800);
    }
}