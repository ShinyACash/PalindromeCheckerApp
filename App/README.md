# PalindromeCheckerApp
Use Case 2: Hardcoded Palindrome Check
At this stage, the application moves beyond a simple startup and implements its first bit of core logic. The program now verifies if a predefined string is a palindrome.

The application now:

- Iterates: Uses a for loop to traverse the string from the last index to the first.

- Concatenates: Builds the reversed result using the + operator.

- Compares Content: Uses .equals() instead of == to ensure the actual character sequences are compared, not just memory addresses.