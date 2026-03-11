/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 9: Recursive Palindrome Validation
 *
 * Changes in this version:
 * - Implemented recursive method isPalindrome(String s).
 * - Defined Base Cases to handle string lengths of 0 and 1.
 * - Leveraged the JVM Call Stack for state management.
 * - Optimized with substring slicing for each recursive step.
 *
 * @author shiny
 * @version 1.8.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.8.0\n---");

        String original = "kayak";
        System.out.println("Analyzing String: " + original);

        if (isPalindrome(original)) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Not a Palindrome.");
        }

        System.out.println("---\nProgram exiting...");
    }

    /**
     * Recursive method to check palindrome status
     */
    public static boolean isPalindrome(String s) {
        // Base Condition: If length is 0 or 1, it's a palindrome
        if (s.length() <= 1) {
            return true;
        }

        // Check first and last characters
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            // Recursive Call: Check the substring excluding the ends
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        // If mismatch occurs, it's not a palindrome
        return false;
    }
}