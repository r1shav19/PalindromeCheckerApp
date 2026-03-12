/**
 * ==============================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 * Goal: Encapsulate palindrome logic inside a service class.
 */

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam";

        PalindromeService service = new PalindromeService();

        boolean result = service.isPalindrome(input);

        System.out.println("Input String: " + input);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

    }
}

/**
 * Service class containing palindrome logic
 */
class PalindromeService {

    public boolean isPalindrome(String input) {

        String processed = input.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < processed.length() / 2; i++) {

            if (processed.charAt(i) != processed.charAt(processed.length() - 1 - i)) {
                return false;
            }

        }

        return true;
    }
}