public class TestProgram {
    public static void main(String[] args){
        // 1. create account
        Account acc = new Account("General Account");
        acc.setBalance(5000);

        // 2. Create a checking account
        CheckingAccount checkAcc = new CheckingAccount("Albert");
        checkAcc.deposit(3000);
        checkAcc.withdraw(1000);

        // 3. Create a saving account
        SavingAccount saveAcc = new SavingAccount("Galileo");
        saveAcc.deposit(10000);
        saveAcc.withdraw(500);

        System.out.println("--------------------------------");
        System.out.println(acc.toString());
        System.out.println("--------------------------------");
        System.out.println(checkAcc.toString());
        System.out.println("--------------------------------");
        System.out.println(saveAcc.toString());
        System.out.println("--------------------------------");
    }
}
