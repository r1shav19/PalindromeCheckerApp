import java.util.Deque;
import java.util.LinkedList;

/**
 * ==============================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque (Double Ended Queue).
 *
 * At this stage, the application:
 * - Stores characters in a Deque
 * - Compares front and rear characters
 * - Removes them if they match
 * - Determines whether the string is a palindrome
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        Deque<Character> deque = new LinkedList<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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