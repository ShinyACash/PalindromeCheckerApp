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

        // UC2: Palindrome Logic
        String original = "madam";

        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Checking string: " + original);

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}

