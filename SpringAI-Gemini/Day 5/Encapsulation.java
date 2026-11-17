    class BankAccount1 {

    // 1. Private fields (hidden from outside)

    private String holderName;
    private double balance;
    public BankAccount1(String holderName, double balance) {
    this.holderName = holderName;
    setBalance(balance);                     // Use setter for validation
    }


    // Getter (read-only access)
    public double getBalance() {
    return this.balance;
    }
    // Setter (controlled write access with validation)
    public void setBalance(double amount) {
    if (amount >= 0) {
    this.balance = amount;
    } else {
    System.out.println("Invalid balance: cannot be negative!");
    }
    }
    }



    public class Encapsulation {
    public static void main(String[] args) {
    BankAccount1 acc = new BankAccount1("Alex", 500);   
                                                                            // acc.balance = -100; // COMPILER ERROR: balance has private access!
    acc.setBalance(-100);                                                     // Prints: Invalid balance: cannot be negative!
    System.out.println(acc.getBalance()); // 500.0
    }
}
