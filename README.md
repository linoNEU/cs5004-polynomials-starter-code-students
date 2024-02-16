# CS 5004 Object-Oriented Design - Homework 3

This repository contains the starter code for Homework 3 of the course CS 5004 Object-Oriented Design. The main objective of this homework is to understand and implement the concept of interfaces and polymorphism in Java.

## Project Overview

The project is about creating and manipulating polynomial equations. A polynomial is defined here as a function of one variable. The polynomial is a weighted sum of terms (the weights are numeric). Each term is a product of a coefficient and a power of the variable. For example, the polynomial `3x^2 + 2x + 1` has three terms: `3x^2`, `2x`, and `1`. The coefficient of the first term is `3`, the coefficient of the second term is `2`, and the coefficient of the third term is `1`. The degree of the polynomial is the highest power of the variable in the polynomial. In this case, the degree is `2`. Please refer to the course's Canvas page for all the details about the project.

The project is structured into two main parts:

1. `Polynomial` interface: This interface represents all the operations offered by a polynomial. It includes methods for adding and multiplying polynomials, adding a term to a polynomial, evaluating the polynomial at a given value, getting the coefficient of a term, and getting the degree of the polynomial.

2. `PolynomialImpl` class: This is the class that students need to create. It should implement the `Polynomial` interface and provide the functionality for the methods defined in the interface.

3. `Main` class: This class is used to test the `Polynomial` and `PolynomialImpl` classes. It creates instances of `PolynomialImpl` and tests the methods defined in the interface.

## Getting Started

To get started with the project, clone the repository and open the project in IntelliJ IDEA 2023.3.1 or any other IDE that supports Java.

## Implementing the PolynomialImpl Class

Students are required to create a `PolynomialImpl` class that implements the `Polynomial` interface. This class should provide the functionality for all the methods defined in the `Polynomial` interface. Students should carefully consider the design of this class and ensure that it correctly implements the interface.

## Writing Unit Tests

In addition to implementing the `PolynomialImpl` class, students are also required to write comprehensive unit tests for this class. These tests should cover all possible edge cases and ensure that the `PolynomialImpl` class works as expected.

## Running the Tests

The `Main` class contains a `main` method which can be used to run the tests. Simply run this class in your IDE to execute the tests.

## Contributing

Please follow the standard Java coding conventions and ensure your code is well-documented. Make sure to thoroughly test your code before uploading it to Gradescope.
