# PalindromeCheckerApp
Use Case 13: Accurate Performance Profiling
This version implements a high-precision benchmarking utility to compare the efficiency of different data structures under load.

The application now:

- Isolates Logic: Ensures that console output (I/O) is excluded from timing to prevent skewed data.

- Warmup Execution: Accounts for Just-In-Time (JIT) compilation by running the method once before recording the time.

- Precision Metrics: Uses System.nanoTime() for sub-millisecond accuracy.