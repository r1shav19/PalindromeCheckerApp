import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * ==============================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome checking using
 * both Stack (LIFO) and Queue (FIFO).
 *
 * At this stage, the application:
 * - Stores characters in a Stack and Queue
 * - Compares Stack pop vs Queue poll
 * - Determines whether the string is a palindrome
 * - Displays the result
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both Stack and Queue
        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {

            char stackChar = stack.pop();   // LIFO
            char queueChar = queue.poll();  // FIFO

            if (stackChar != queueChar) {
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