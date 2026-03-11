/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 10: Pre-processing & Regular Expressions
 *
 * Changes in this version:
 * - Implemented string normalization (lowercase conversion).
 * - Used Regex to remove spaces and non-alphanumeric characters.
 * - Integrated UC4's optimized Two-Pointer logic for the check.
 * - Handles complex phrases and sentences.
 *
 * @author shiny
 * @version 1.9.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.9.0\n---");

        String input = "A man, a plan, a canal: Panama";
        System.out.println("Original Input: " + input);

        // UC10: Normalization
        // [^a-zA-Z0-9] means "anything that is NOT a letter or a digit"
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("Normalized Input: " + normalized);

        if (isPalindrome(normalized)) {
            System.out.println("Result: Success! It is a phrase palindrome.");
        } else {
            System.out.println("Result: Failed. Not a palindrome.");
        }

        System.out.println("---\nProgram exiting...");
    }

    // Using UC4's Two-Pointer logic because it's the cleanest for normalized strings
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}