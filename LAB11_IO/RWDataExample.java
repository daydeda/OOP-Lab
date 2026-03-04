import java.io.*;
import java.util.*;

public class RWDataExample {
    public static void main(String[] args) {
        String filename = "RWdata.txt";

        // Write 100 random integers to file
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                writer.print(rand.nextInt(100)); // integers 0–99
                if (i < 99)
                    writer.print(" ");
            }
            System.out.println("100 random integers written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }

        // Read back from file and display sorted
        try (Scanner scanner = new Scanner(new File(filename))) {
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            Collections.sort(numbers);

            System.out.println("Sorted integers:");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i));
                if (i < numbers.size() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}