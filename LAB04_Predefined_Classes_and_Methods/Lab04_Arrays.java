// Puri Sangnawakit 682115036
package LAB04_Predefined_Classes_and_Methods;

import java.util.Scanner;
import java.util.Arrays;

public class Lab04_Arrays {
    public static void main(String[] args) {

        // 1. Input
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // 2. [Process] Sorted array
        Arrays.sort(numbers);
        System.out.println("\nSorted Numbers: " + Arrays.toString(numbers));

        // 3. [Search] find a number
        System.out.print("Enter a number to search for: ");
        int target = input.nextInt();
        int index = Arrays.binarySearch(numbers, target);
        if(index >= 0){
            System.out.println("Found " + target + " at sorted index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }


        input.close();
    }
}