// SimpleAlgorithms.java
public class SimpleAlgorithms {

    // 1. Find the maximum of two numbers
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    // 2. Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 4. Count the number of characters in a string
    public static int countCharacters(String str) {
        return str.length();
    }

    // 5. Check if a number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Main method to test the algorithms
    public static void main(String[] args) {
        // Test findMax
        System.out.println("Max of 10 and 20: " + findMax(10, 20));

        // Test isEven
        System.out.println("Is 10 even? " + isEven(10));

        // Test addNumbers
        System.out.println("Sum of 3 and 7: " + addNumbers(3, 7));

        // Test countCharacters
        System.out.println("Number of characters in 'hello': " + countCharacters("hello"));

        // Test isPositive
        System.out.println("Is 7 positive? " + isPositive(7));
    }
}
