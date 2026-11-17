class Bank {

    String accountHolder;
    double balance;

    // Constructor
    Bank(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit
    void deposit(double amount) {
        balance = balance + amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } 
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

 public  class Bankaccount {

    public static void main(String[] args) {

        Bank account = new Bank("Yash", 5000);

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Initial Balance: " + account.balance);

        account.deposit(2000);

        account.withdraw(1500);

    }
}