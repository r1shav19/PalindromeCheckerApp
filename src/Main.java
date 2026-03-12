import java.util.Stack;

/**
 * ==============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses palindrome strategy implementations
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Strategies to test
        PalindromeStrategy reverseStrategy = new ReverseStrategy();
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy recursiveStrategy = new RecursiveStrategy();

        // Reverse Strategy Benchmark
        long startTime = System.nanoTime();
        boolean result1 = reverseStrategy.isPalindrome(input);
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;

        // Stack Strategy Benchmark
        startTime = System.nanoTime();
        boolean result2 = stackStrategy.isPalindrome(input);
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;

        // Recursive Strategy Benchmark
        startTime = System.nanoTime();
        boolean result3 = recursiveStrategy.isPalindrome(input);
        endTime = System.nanoTime();
        long duration3 = endTime - startTime;

        System.out.println("Input String: " + input);
        System.out.println();

        System.out.println("Reverse Strategy Result: " + result1 + " | Time: " + duration1 + " ns");
        System.out.println("Stack Strategy Result: " + result2 + " | Time: " + duration2 + " ns");
        System.out.println("Recursive Strategy Result: " + result3 + " | Time: " + duration3 + " ns");
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

/**
 * Reverse String Strategy
 */
class ReverseStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

/**
 * Stack Strategy
 */
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }
}

/**
 * Recursive Strategy
 */
class RecursiveStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        return check(input, 0, input.length() - 1);
    }

    private boolean check(String str, int left, int right) {

        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return check(str, left + 1, right - 1);
    }
}