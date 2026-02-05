// Puri Sangnawakit 682115036
package LAB04_Predefined_Classes_and_Methods;

import java.util.Random;

public class Lab04_Math {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse: " + c);

        Random rand = new Random(); // --> remove seed for true random numbers Random(20) --> Random()
        for (int i = 1; i <= 5; i++) {
            System.out.println("Random sequence (seed20) " + i + ": " + rand.nextInt(100));
        }

        System.out.println();
        // Dice roll
        System.out.println("Dice roll: " + (rand.nextInt(6) + 1));
    }
}