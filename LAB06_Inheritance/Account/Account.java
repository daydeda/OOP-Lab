import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private static int idCounter = 1000;

    // Constructor
    public Account(String name) {
        this.name = name;
        this.id = idCounter++;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Type: Generic Account\n" +
                "ID: " + this.id + "\n" +
                "Balance: " + this.balance + "\n" +
                "Date Created: " + this.dateCreated;
    }
}