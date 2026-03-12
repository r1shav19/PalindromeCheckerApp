/**
 * ==============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * while ignoring spaces and letter case.
 *
 * Example:
 * "A man a plan a canal Panama" → Palindrome
 *
 * @author Developer
 * @version 10.0
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < processed.length() / 2; i++) {

            if (processed.charAt(i) != processed.charAt(processed.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Original Input: " + input);
        System.out.println("Processed Input: " + processed);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}