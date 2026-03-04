import java.io.*;
import java.util.*;

public class IOLab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file name containing scores: ");
        String filename = input.nextLine().trim();

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            int total = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                total += fileScanner.nextInt();
                count++;
            }

            if (count == 0) {
                System.out.println("No scores found in the file.");
            } else {
                double average = (double) total / count;
                System.out.println("Total score: " + total);
                System.out.printf("Average score: %.2f%n", average);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}