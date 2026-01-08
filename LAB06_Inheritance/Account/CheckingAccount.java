public class CheckingAccount extends Account {

    public CheckingAccount(String name) {
        super(name);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("Your account has not enough money.");
        } else {
            super.withdraw(amount);
        }
    }
    /*
     * @Override
     * public String toString() {
     * return "Account Type: Checking Account\n" +
     * "Overdraft Limit: " + this.overdraftLimit + "\n" +
     * super.toString(); // Reuses the ID and Balance logic from the parent
     * }
     */
}