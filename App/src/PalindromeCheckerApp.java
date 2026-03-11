import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 7: Deque (Double-Ended Queue) Comparison
 *
 * Changes in this version:
 * - Introduced java.util.Deque for front and rear access.
 * - Utilized ArrayDeque for high-performance implementation.
 * - Implemented simultaneous removal from both ends.
 * - Optimized logic to handle middle character in odd-length strings.
 *
 * @author shiny
 * @version 1.6.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.6.0");
        System.out.println("System Initialized successfully\n---");

        String original = "deified";
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("Analyzing String: " + original);

        // Load characters into the Deque
        for (char c : original.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        /*
         * UC7 Logic:
         * While there is more than one character, compare the front and back.
         * If the deque has 1 or 0 chars left, the check is complete.
         */
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: Success! Deque front/rear matched. It is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Mismatch detected.");
        }

        System.out.println("---\nProgram exiting...");
    }
}