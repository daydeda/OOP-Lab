public class Deposit{
    public static void main(String[] args){
        int deposit = 1;
        int total = 0;
        for(int day = 1; day <= 30; day++){
            total += deposit;
            System.out.println("day " + day + " " + "deposit " + deposit + " total " + total);
            deposit *= 2;
        }
    }
}