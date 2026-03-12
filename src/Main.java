/**
 * ==============================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using recursion.
 *
 * The recursive method compares characters from both ends
 * and calls itself with a smaller substring.
 *
 * @author Developer
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int left, int right) {

        // Base case
        if (left >= right) {
            return true;
        }

        // If characters don't match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}