# Mutation Testing Demo

This is a minimal Java Maven project to demonstrate mutation testing using PIT (pitest).

## Structure
- `MathOperations.java`: Simple math operations class
- `MathOperationsTest.java`: JUnit tests for math operations

## How to Run

1. **Run Tests:**
   ```sh
   mvn test
   ```
2. **Run Mutation Testing:**
   ```sh
   mvn org.pitest:pitest-maven:mutationCoverage
   ```
3. **View Report:**
   Open `target/pit-reports/index.html` in your browser.

## Requirements
- Java 11 or higher
- Maven
