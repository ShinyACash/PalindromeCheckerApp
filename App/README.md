# PalindromeCheckerApp
Use Case 2: Hardcoded Palindrome Check
At this stage, the application moves beyond a simple startup and implements its first bit of core logic. The program now verifies if a predefined string is a palindrome.

The application now:

- Converts Data: Transforms the String into a char[] (primitive character array).

- Two-Pointer Logic: Uses two integer variables (left and right) to track positions from both ends of the array simultaneously.

- Early Exit: The loop terminates immediately if a mismatch is detected, saving CPU cycles.