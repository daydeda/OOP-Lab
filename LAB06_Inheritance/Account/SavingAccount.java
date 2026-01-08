public class SavingAccount extends Account {
    private int count = 0;
    private final int LIMIT = 5;

    public SavingAccount(String name) {
        super(name);
    }

    @Override
    public void withdraw(double amount) {
        // Check if limit is reached
        if (count >= LIMIT) {
            System.out.println("Your withdraw can not process.");
            System.out.println("This month you attempt to withdraw " + (count + 1) + " times.");
            return;
        }

        // Check for insufficient funds
        if (getBalance() < amount) {
            System.out.println("Your withdraw can not process.");
            System.out.println("This month you attempt to withdraw " + (count + 1) + " times.");
            return;
        }

        // Process successful withdrawal
        super.withdraw(amount);
        count++;

        System.out.println(count);
        System.out.println(getBalance());
    }

    /*
     * @Override
     * public String toString() {
     * return "Account Type: Savings Account\n" +
     * "Withdrawals this month: " + this.count + "\n" +
     * super.toString();
     * }
     */
}