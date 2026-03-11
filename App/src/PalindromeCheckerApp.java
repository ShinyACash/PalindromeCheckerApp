/*
 * ==========================================
 * INTERFACE - PalindromeStrategy.java
 * ==========================================
 * Defines the contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/* * Concrete Strategy 1: Stack-based (LIFO)
 */
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (char c : clean.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return clean.equals(reversed.toString());
    }
}

/* * Concrete Strategy 2: Two-Pointer (Memory Efficient)
 */
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
}

/*
 * ==========================================
 * CONTEXT CLASS - PalindromeChecker.java
 * ==========================================
 */
class PalindromeChecker {
    private PalindromeStrategy strategy;

    // Inject the strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void check(String text) {
        if (strategy == null) {
            System.out.println("No strategy selected!");
            return;
        }
        System.out.println("Using " + strategy.getClass().getSimpleName() + "...");
        System.out.println("Result: " + strategy.isValid(text));
    }
}

/*
 * MAIN CLASS
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 3.0.0\n---");

        PalindromeChecker app = new PalindromeChecker();
        String test = "Race Car";

        // Swap algorithms on the fly
        app.setStrategy(new StackStrategy());
        app.check(test);

        app.setStrategy(new TwoPointerStrategy());
        app.check(test);
    }
}