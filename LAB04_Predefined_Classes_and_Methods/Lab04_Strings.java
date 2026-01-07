// Puri Sangnawakit 682115036
package LAB04_Predefined_Classes_and_Methods;

public class Lab04_Strings {
    public static void main(String[] args) {
        String data = " LogID: 582103 ";
        //1. Data Cleaning
        System.out.println("After trim: "+data.substring(8, 13)); // Extract LogID number
            // 1.2 Find Index
        System.out.println("Index of Colon: " + data.indexOf(":"));

        //2. Case Conversion
        System.out.println("After convert: " + data.toUpperCase());

        //3. Formatted Report
        System.out.println("Length of string: " + data.trim().length() + "\n");
        System.out.printf("| ID: %s | Length: %d |%n", data.trim().toUpperCase(), data.trim().length());
        

    }
}
