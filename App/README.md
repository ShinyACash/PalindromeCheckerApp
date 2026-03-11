# PalindromeCheckerApp
Use Case 12: Strategy Pattern & Runtime Polymorphism
This stage implements the Strategy Design Pattern, allowing the application to switch between different palindrome-checking algorithms (Stack, Deque, Two-Pointer) dynamically.

The application now:

- Defines an Interface: PalindromeStrategy acts as a blueprint, ensuring all algorithms follow the same isValid() contract.

- Implements Concrete Strategies: Separate classes like StackStrategy and TwoPointerStrategy provide different technical implementations.

- Injects Dependency: The PalindromeChecker class uses Dependency Injection via a setter method to decide which algorithm to use at runtime.
