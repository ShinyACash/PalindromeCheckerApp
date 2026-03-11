# PalindromeCheckerApp
Use Case 10: Normalization & Regex Pre-processing
This stage focuses on Data Sanitization. In real-world scenarios, palindromes often include punctuation, spaces, and mixed casing (e.g., "Was it a car or a cat I saw?").

The application now:

- Normalizes Case: Converts the entire string to lowercase using .toLowerCase().

- Cleans Data: Uses the replaceAll() method with a Regular Expression ([^a-zA-Z0-9]) to strip away spaces, commas, colons, and other non-alphanumeric symbols.

- Validates Phrases: The core logic now operates on a "clean" version of the input, allowing for sentence-level palindrome detection.
