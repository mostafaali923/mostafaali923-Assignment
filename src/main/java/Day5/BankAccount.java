package Day5;

public class BankAccount {

    private double balance; // Global Variable

    public BankAccount(double initialbalance) {
        balance = initialbalance;

        if (initialbalance < 0)
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }
}
