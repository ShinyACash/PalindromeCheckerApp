import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 6: FIFO vs LIFO Comparison (Queue vs Stack)
 *
 * Changes in this version:
 * - Introduced java.util.Queue and LinkedList implementation.
 * - Enqueued characters (FIFO) and Pushed characters (LIFO).
 * - Compared outputs of dequeue (poll) and pop directly.
 * - Validated palindrome logic through structural behavior.
 *
 * @author shiny
 * @version 1.5.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.5.0");
        System.out.println("System Initialized successfully\n---");

        String original = "radar";

        // Stack for LIFO (Last In First Out)
        Stack<Character> stack = new Stack<>();
        // Queue (via LinkedList) for FIFO (First In First Out)
        Queue<Character> queue = new LinkedList<>();

        System.out.println("Input String: " + original);

        // Load both structures
        for (char c : original.toCharArray()) {
            stack.push(c);  // LIFO
            queue.add(c);   // FIFO
        }

        boolean isPalindrome = true;

        /*
         * UC6 Logic:
         * Pop (Last In) and Poll (First In) should match
         * for every character in a palindrome.
         */
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("Result: Success! Structures match. It is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Structures do not match.");
        }

        System.out.println("---\nProgram exiting...");
    }
}