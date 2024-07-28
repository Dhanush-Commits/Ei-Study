# Strategy Pattern

## Overview
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern lets the algorithm vary independently from clients that use it.

## Use Case
A payment system with different payment methods (Credit Card, PayPal, Bitcoin).

## Classes

### Interfaces
- **PaymentStrategy**: Interface for payment strategies.

### Concrete Classes
- **CreditCardStrategy**: Concrete payment strategy class for credit card payments.
- **PayPalStrategy**: Concrete payment strategy class for PayPal payments.
- **BitcoinStrategy**: Concrete payment strategy class for Bitcoin payments.
- **ShoppingCart**: Context class that uses a payment strategy.

## How to Run the Demo
The `StrategyPatternDemo.java` class demonstrates how different payment methods can be used interchangeably.

To run the demo:
1. Navigate to the directory `DesignPatterns\Behavioral\Strategy`.
2. Compile the Java files: `javac *.java`.
3. Run the demo: `java StrategyPatternDemo`.
