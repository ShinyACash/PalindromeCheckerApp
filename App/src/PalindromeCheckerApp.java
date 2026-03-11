import java.util.*;

/* * Standard Strategy Interface
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/* * Strategy 1: The "Heavy" approach (Stack)
 */
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        // Normalization should happen inside or before to be fair
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);

        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

/* * Strategy 2: The "Lean" approach (Two-Pointer)
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

/* * The Runner Class
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("--- Palindrome Performance Lab ---");

        // 100k characters - enough to make the JVM sweat
        String testData = "a".repeat(100000);

        runTest(new StackStrategy(), testData);
        runTest(new TwoPointerStrategy(), testData);
    }

    public static void runTest(PalindromeStrategy strategy, String data) {
        String name = strategy.getClass().getSimpleName();

        // Warm up the JVM (standard practice for benchmarking)
        strategy.isValid(data);

        long start = System.nanoTime();
        boolean result = strategy.isValid(data);
        long end = System.nanoTime();

        double millis = (end - start) / 1_000_000.0;
        System.out.printf("[%s] Result: %b | Time: %.4f ms%n", name, result, millis);
    }
}