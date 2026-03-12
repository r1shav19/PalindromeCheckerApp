import java.util.Stack;

/**
 * ==============================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Goal:
 * Dynamically choose different palindrome algorithms.
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose algorithm dynamically
        PalindromeStrategy strategy = new ReverseStrategy();

        boolean result = strategy.isPalindrome(input);

        System.out.println("Input String: " + input);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {

    boolean isPalindrome(String input);

}

/**
 * Strategy 1: Reverse String Algorithm
 */
class ReverseStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        String reversed = new StringBuilder(input).reverse().toString();

        return input.equals(reversed);
    }
}

/**
 * Strategy 2: Stack Algorithm
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
 * Strategy 3: Recursive Algorithm
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