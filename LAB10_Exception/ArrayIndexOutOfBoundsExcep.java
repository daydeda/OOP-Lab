import java.util.Scanner;
import java.util.Random;

public class ArrayIndexOutOfBoundsExcep {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt();
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter index of array(0 - 99) : ");

        try {
            int index = input.nextInt();
            System.out.println("The value at index is " + array[index] + ".");
            System.out.println("End nicely.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You refer to index that does not exist.");
        } catch (Exception ex) {
            System.out.println("Invalid input.");
        }

        System.out.println("Continuing processing ...");
        input.close();
    }
}
