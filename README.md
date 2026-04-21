# Mutation Testing Demo

This is a minimal Java Maven project to demonstrate mutation testing using PIT (pitest).

## Structure
- `OtherMathOperations.java`: Simple math operations class
- `PowerFunction.java`: Power calculation class
- `OtherMathOperationsTest.java`: JUnit tests for math operations

## How to Run

1. **Run Tests:**
   ```sh
   mvn test
   ```
2. **Run Mutation Testing:**
   ```sh
   mvn clean test-compile pitest:mutationCoverage
   ```
3. **View Report:**
   Open `target/pit-reports/index.html` in your browser.

## Requirements
- Java 11 or higher
- Maven
