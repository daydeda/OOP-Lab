public class DepositSec {
    public static void main(String[] args) {
        int saving = 1;
        int total = 0;
        int day = 1;
        while (saving <= 1_000_000){
            total += saving;
            System.out.println("day " + day + " " + "Vader total saving " + total);
            day++;
            saving *= 2;
        }
    }
}
