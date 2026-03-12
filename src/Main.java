/**
 * ==============================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with the original.
 *
 * At this stage, the application:
 * - Stores a string
 * - Reverses the string
 * - Compares original and reversed values
 * - Displays the result
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";   // Example string

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}