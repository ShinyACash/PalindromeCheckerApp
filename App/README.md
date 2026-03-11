# PalindromeCheckerApp
Use Case 11: Encapsulation & Service-Oriented Architecture
This stage refactors the procedural code into a proper Object-Oriented structure, focusing on clean code principles and maintainability.

The application now:

- Encapsulates Logic: All palindrome-related math and regex are hidden inside the PalindromeService class.

- Abstractions: The main method interacts only with the public interface of the service, unaware of whether it uses a Stack, Array, or Recursion under the hood.

- Separates Concerns: The PalindromeCheckerApp handles user interaction, while PalindromeService handles data processing.
