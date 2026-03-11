# PalindromeCheckerApp
Use Case 7: Deque Front and Rear Validation
This stage utilizes the Deque (Double-Ended Queue), a versatile structure that combines the best parts of Stacks and Queues for symmetrical data validation.

The application now:

- Populates: Adds every character to the Rear of the Deque.

- Simultaneous Extraction: Pulls one character from the Front and one from the Rear in each iteration.

- Efficient Termination: Continues only as long as size > 1. If the characters match until the Deque is empty or has only one "middle" character left, it’s a palindrome.
