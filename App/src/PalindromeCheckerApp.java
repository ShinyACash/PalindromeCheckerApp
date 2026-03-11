import java.util.Stack;

/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 5: Stack Data Structure for Reversal
 *
 * Changes in this version:
 * - Introduced java.util.Stack for LIFO operations.
 * - Implemented Push logic to load characters.
 * - Implemented Pop logic to reconstruct the string in reverse.
 * - Validated palindrome by comparing Stack output with original.
 *
 * @author shiny
 * @version 1.4.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.4.0");
        System.out.println("System Initialized successfully\n---");

        String original = "noon";
        Stack<Character> stack = new Stack<>();

        System.out.println("Input String: " + original);

        // UC5: Push characters into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // UC5: Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Popped from Stack: " + reversed);

        // Comparison
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Not a Palindrome.");
        }

        System.out.println("---\nProgram exiting...");
    }
}