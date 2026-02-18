import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] args) {
        // 1. Test GenericStack
        System.out.println("--- Test GenericStack ---");
        GenericStack<String> stack = new GenericStack<>();
        stack.push("London");
        stack.push("Paris");
        stack.push("Berlin");
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Test resizing
        System.out.println("\n--- Test Stack Resizing ---");
        GenericStack<Integer> intStack = new GenericStack<>();
        for (int i = 0; i < 15; i++) {
            intStack.push(i);
        }
        System.out.println("Stack size: " + intStack.getSize());
        System.out.println("Stack content: " + intStack);
        
        // 2. Test Shuffle
        System.out.println("\n--- Test Shuffle ---");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Original list: " + list);
        shuffle(list);
        System.out.println("Shuffled list: " + list);

        // 3. Test Min
        System.out.println("\n--- Test Min ---");
        System.out.println("Min element: " + min(list));

        // 4. Test Sort
        System.out.println("\n--- Test Sort ---");
        sort(list);
        System.out.println("Sorted list: " + list);
    }

    // 2. Shuffle ArrayList
    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int) (Math.random() * list.size());
            E temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }

    // 3. Smallest element in ArrayList
    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        if (list == null || list.isEmpty()) return null;
        E min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    // 4. Sort ArrayList (Selection Sort)
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(minIndex).compareTo(list.get(j)) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                E temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
