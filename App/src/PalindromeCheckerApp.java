/*
 * ==========================================
 *   MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * At this stage, the application:
 *  - Starts execution from the main() method
 *  - Displays a welcome message
 *  - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author shiny
 * @version 1.0.0
 */

public class PalindromeCheckerApp{

    /*
     * Application entry point
     *
     * This is the first method executed by the JVM
     * when the program starts
     *
     * @params args Command-line arguments
     *
     */

    public static void main(String[] args){
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.1.0");
        System.out.println("System Initialized successfully\n---");

        // UC3: Manual Logic
        String original = "racecar"; // Hardcoded for now
        String reversed = "";

        System.out.println("Target String: " + original);

        /*
         * Loop Logic:
         * Start from the last index (length - 1) and move to 0.
         * We concatenate each character to our 'reversed' string.
         */
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // UC3: content-based comparison using .equals()
        if (original.equals(reversed)) {
            System.out.println("Result: Success! It is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Not a Palindrome.");
        }
    }
}

