package String;

public class StringManipulator{
    public static void main(String[] args){
        // Part 3A: String Immutability
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        //Part 3B: StringBuilder for Modification
        StringBuilder sb = new StringBuilder("programming");
        sb.insert(0, "fun");
        System.out.println(sb.toString()); // funprogramming
        sb.append(" is great");
        System.out.println(sb.toString()); // funprogramming is great
        sb.delete(0,3);
        System.out.println(sb.toString()); // programming is great
    }
}