# PalindromeCheckerApp
Use Case 9: Recursive Slicing & Call Stack
This stage moves away from iterative loops and utilizes Recursion, where the function calls itself to solve smaller versions of the same problem.

The application now:

- Evaluates Ends: Checks the character at index 0 and index length-1.

- Recursive Step: If the ends match, the function calls itself with a substring (removing the first and last characters).

- Base Case: Terminates when the string length reaches 1 (middle character) or 0 (even-length symmetry).
