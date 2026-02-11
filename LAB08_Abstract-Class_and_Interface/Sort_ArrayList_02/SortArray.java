package Sort_ArrayList_02;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<Number>();
        
        System.out.print("Enter five integers and five doubles: ");
        // Read 5 Integers
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        
        // Read 5 Doubles
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        
        input.close();
        // Sort the list
        sort(list);
        
        // Display results
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}