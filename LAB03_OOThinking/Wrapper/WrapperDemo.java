package Wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        // Max/Min Values
        System.out.println("Maximum possible for int: " + Integer.MAX_VALUE);
        System.out.println("Minimum possible for double: " + Double.MIN_VALUE);
        // String to Wrapper Object
        Integer intNum = Integer.valueOf("500");
        Double doubleNum = Double.valueOf("123.45");
        // Unboxing/Conversion
        System.out.println("Double converted to int: " + doubleNum.intValue());
        // Parsing
        int parsedInt = Integer.parseInt("1999");
        System.out.println("Parsed int: " + parsedInt);
    }
}
    // Max/Min Values
    /*
     * System.out.println("Max int value: " + Integer.MAX_VALUE);
     * System.out.println("Min double value: " + Double.MIN_VALUE);
     * 
     * // String to Wrapper Object
     * Integer num = Integer.valueOf("500");
     * Double decimal = Double.valueOf("123.45");
     * 
     * // Unboxing/Conversion
     * int convertedInt = decimal.intValue();
     * System.out.println("Double converted to int: " + convertedInt);
     * 
     * // Parsing
     * int parsed = Integer.parseInt("1999");
     * System.out.println("Parsed int: " + parsed);
     * }
     * 
     * public static Integer valueOf(String s) {
     * return Integer.valueOf(s);
     * }
     */