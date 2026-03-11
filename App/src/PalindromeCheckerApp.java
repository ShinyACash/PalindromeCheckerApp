import java.util.LinkedList;
import java.util.ListIterator;

/*
 * ==========================================
 * MAIN CLASS - PalindromeCheckerApp.java
 * ==========================================
 *
 * Use Case 8: Java Collections LinkedList & ListIterator
 *
 * Changes in this version:
 * - Replaced custom Node logic with java.util.LinkedList.
 * - Used ListIterator for bidirectional traversal.
 * - Optimized comparison by moving from both ends toward the middle.
 *
 * @author shiny
 * @version 1.7.1
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker App.\nVersion : 1.7.1\n---");

        String original = "racecar";
        LinkedList<Character> list = new LinkedList<>();

        // Load string into the LinkedList
        for (char c : original.toCharArray()) {
            list.add(c);
        }

        System.out.println("Analyzing LinkedList: " + list);

        if (isPalindrome(list)) {
            System.out.println("Result: Success! The LinkedList is a Palindrome.");
        } else {
            System.out.println("Result: Failed. Not a Palindrome.");
        }

        System.out.println("---\nProgram exiting...");
    }

    public static boolean isPalindrome(LinkedList<Character> list) {
        if (list.isEmpty()) return true;

        // Using ListIterators to point at the start and the end
        ListIterator<Character> forward = list.listIterator();
        ListIterator<Character> backward = list.listIterator(list.size());

        /*
         * UC8 Logic:
         * Move 'forward' from 0 and 'backward' from size.
         * Stop when they meet in the middle.
         */
        while (forward.nextIndex() < backward.previousIndex()) {
            if (!forward.next().equals(backward.previous())) {
                return false; // Mismatch found
            }
        }

        return true;
    }
}