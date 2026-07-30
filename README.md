# Java Unit Testing Suite
 
A comprehensive collection of Java programs with JUnit test cases demonstrating different testing strategies, fault detection techniques, and object-oriented programming concepts.
 
## Project Overview
This project showcases various unit testing approaches, including test case design, fault detection (RIPR model), exception handling, inheritance, and polymorphism in Java. It includes both simple utility functions and more complex object-oriented designs.
 
## Project Structure
 
```
├── countpositive/
│── CountPositive.java          # Counts positive numbers in an array
│── CountPositiveTest.java      # JUnit 4 tests for CountPositive
│── OddorPos.java               # Counts odd or positive numbers
│── OddorPosTest.java           # JUnit 5 tests for OddorPos
│── PrimeNumbers.java           # Generates prime numbers (with intentional fault)
│── PrimeNumbersTest.java       # JUnit 5 tests demonstrating RIPR model
├── Person.java                 # Abstract base class for employees
├── Hourly.java                 # Hourly employee implementation
└── HourlyTest.java             # JUnit 4 tests for Hourly class
```
 
## Modules
 
### 1. CountPositive
**Purpose:** Count the number of non-negative integers in an array
**Test Cases:**
- Mixed values (positive, negative, zero)
- All negative numbers
- All positive numbers
- Null array (exception handling)
**Usage:**
```bash
java countpositive.CountPositive 5 -3 0 2 -1
# Output: Number of positive numbers is: 3
```
 
---
 
### 2. OddorPos
**Purpose:** Count elements that are either odd OR positive (or both)
**Test Cases:**
- Mixed positive and negative
- All positive even numbers
- All negative odd numbers
- Empty array
- Null pointer exception
**Usage:**
```bash
java com.mycompany.oddorpos.OddorPos -3 -2 0 1 4
# Output: Number of elements that are either odd or positive is: 3
```
 
---
 
### 3. PrimeNumbers 
**Purpose:** Generate the first N prime numbers (demonstrates fault detection)
**Fault Location:**
```java
if(isPrime && (number % 10 != 9)) {  // BUG: Excludes primes ending in 9
    primes.add(number);
}
```
 
**Test Cases Demonstrating RIPR:**
- **(a) Does Not Reach Fault**: Tests with small numbers (2, 3, 5, 7)
- **(b) Reaches But Does Not Infect**: Condition evaluated but fault not triggered
- **(c) Infects But Does Not Propagate**: State changed but output hides the difference
- **(d) Propagates But Does Not Reveal**: Difference exists but test oracle misses it
- **(e) Reveals the Fault**: Complete comparison shows missing primes (e.g., 19)
**Expected Output (First 8 Primes):**
```
[2, 3, 5, 7, 11, 13, 17, 19]
```
 
---
 
### 4. Person & Hourly
**Purpose:** Demonstrate inheritance and polymorphism in employee management
 
**Person (Abstract Class):**
- Base class for all employee types
- Properties: name, hire date, employee ID
- Abstract method: `pay()`
**Hourly (Concrete Implementation):**
- Extends Person
- Properties: payRate, hours worked, job title
- Implements pay calculation: `payRate × hours`
**Test Cases:**
- Get job title
- Get pay rate
- Verify hours are positive
- Inheritance and polymorphism verification
**Usage:**
```bash
java personshourly.Hourly
# Output: 
# Employee Info:
# Name=Alice, id=101, date=2025-01-01
# payRate=$20.00, hours=40.0, job=Developer
#
# Weekly Pay:
# 40.00 hours @ $20.00 = $800.00 weekly
```
 
---
 
## Requirements
 
- **Java Development Kit (JDK)**: Java 8 or higher
- **JUnit**: 
  - JUnit 4 (for CountPositive and Hourly tests)
  - JUnit 5 (for OddorPos and PrimeNumbers tests)
- **IDE**: NetBeans, Eclipse, IntelliJ IDEA, or VS Code with Java extensions (optional)

## Key Learning Concepts
 
### Unit Testing
- Writing effective test cases
- Using JUnit 4 and JUnit 5 annotations
- Test-driven development (TDD)
### Fault Detection (RIPR Model)
- **Reachability**: Does the test execute the faulty code?
- **Infection**: Does the fault cause incorrect state?
- **Propagation**: Does the incorrect state affect the output?
- **Revelation**: Does the test oracle detect the difference?
### Object-Oriented Programming
- Abstract classes and inheritance
- Polymorphism and method overriding
- Interfaces (Iterable implementation)
### Exception Handling
- NullPointerException handling
- NumberFormatException in user input
- Expected exception testing in JUnit
### Data Structures
- Array manipulation and iteration
- List usage for dynamic collections
- Iterator pattern implementation
---
 
## Expected Test Results
 
All tests should pass except **PrimeNumbersTest.testRevealsTheFault()**, which demonstrates the intentional bug: 
```
CountPositiveTest:     ✓ All tests pass
OddorPosTest:          ✓ All tests pass
HourlyTest:            ✓ All tests pass
PrimeNumbersTest:      
  - testDoesNotReachFault()     ✓ Pass
  - testDoesNotInfect()         ✓ Pass
  - testDoesNotPropagate()      ✓ Pass
  - testPropagates()            ✓ Pass
  - testRevealsTheFault()       ✗ FAIL (Expected: [2, 3, 5, 7, 11, 13, 17, 19], but got: [2, 3, 5, 7, 11, 13, 17])
```
---

## License
 
This project is provided as is for educational purposes.
---
 
**Note:** This project is designed for learning software testing principles and Java fundamentals. The intentional bug in PrimeNumbers is meant to demonstrate testing concepts, not production code.
