import java.util.Stack;

/**
 * ==============================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using a singly linked list.
 *
 * Steps:
 * - Convert string characters into nodes of a linked list
 * - Push characters into a stack
 * - Compare linked list traversal with stack pop values
 *
 * @author Developer
 * @version 8.0
 */

public class UseCase8PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "level";

        Node head = null;
        Node temp = null;

        // Create Linked List
        for (char c : input.toCharArray()) {

            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        Stack<Character> stack = new Stack<>();

        Node current = head;

        // Push elements into stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        boolean isPalindrome = true;
        current = head;

        // Compare stack and linked list
        while (current != null) {

            if (current.data != stack.pop()) {
                isPalindrome = false;
                break;
            }

            current = current.next;
        }

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}