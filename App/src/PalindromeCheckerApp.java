/*
 * ==========================================
 * SERVICE CLASS - PalindromeService.java
 * ==========================================
 * * This class encapsulates the logic for palindrome validation.
 * It follows the Single Responsibility Principle (SRP).
 */
class PalindromeService {

    /**
     * Encapsulated logic to check if a string is a palindrome.
     * Uses UC10 normalization and UC4 two-pointer efficiency.
     * * @param input The raw string to check
     * @return boolean true if palindrome, false otherwise
     */
    public boolean isPalindrome(String input) {
        if (input == null) return false;

        // Step 1: Normalize (Encapsulated Pre-processing)
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Validate (Internal Logic)
        return checkLogic(clean);
    }

    // Private helper method - Internal implementation detail
    private boolean checkLogic(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}

/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 * * Use Case 11: Encapsulation & OOP Structure
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 2.0.0\n---");

        // Create an instance of the service (Encapsulation)
        PalindromeService service = new PalindromeService();

        String testPhrase = "Was it a car or a cat I saw?";

        // The main class doesn't care HOW it's checked, just that it IS checked.
        if (service.isPalindrome(testPhrase)) {
            System.out.println("Result: '" + testPhrase + "' is a Palindrome.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }

        System.out.println("---\nProgram exiting...");
    }
}