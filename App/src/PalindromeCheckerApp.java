/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 4: Character Array & Two-Pointer Approach
 *
 * Changes in this version:
 * - Converted String to char[] for direct index access.
 * - Implemented Two-Pointer logic (Left and Right).
 * - Eliminated the need for a "reversed" String object.
 * - Optimized performance (O(n/2) comparisons).
 *
 * @author shiny
 * @version 1.3.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.3.0");
        System.out.println("System Initialized successfully\n---");

        // UC4: Two-Pointer Logic
        String original = "racecar";
        char[] charArray = original.toCharArray(); // Convert to char array

        boolean isPalindrome = true;
        int left = 0;
        int right = charArray.length - 1;

        System.out.println("Analyzing: " + original);

        /*
         * Two-Pointer Technique:
         * We compare the character at 'left' with the character at 'right'.
         * If they match, we move both pointers toward the center.
         */
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Not a Palindrome.");
        }

        System.out.println("---\nProgram exiting...");
    }
}