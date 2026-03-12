/**
 * ==============================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting the string into a character array and
 * comparing characters from both ends.
 *
 * At this stage, the application:
 * - Converts a string to a character array
 * - Compares characters from start and end
 * - Determines whether the string is a palindrome
 * - Displays the result
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < chars.length / 2; i++) {

            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}