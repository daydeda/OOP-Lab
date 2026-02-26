import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();

                System.out.println("The number entered is " + (number1 + number2));
                continueInput = false;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.nextLine(); // Discard input
            }
        } while (continueInput);
        scanner.close();
    }
}
