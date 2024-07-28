# Builder Pattern

## Overview
The Builder Pattern constructs a complex object step by step. It separates the construction of a complex object from its representation so that the same construction process can create different representations.

## Use Case
Building different types of computers (Gaming, Office).

## Classes

### Interfaces
- **ComputerBuilder**: Interface for building the computer.

### Concrete Classes
- **Computer**: Class representing the product.
- **GamingComputerBuilder**: Concrete builder class for gaming computers.
- **OfficeComputerBuilder**: Concrete builder class for office computers.
- **ComputerDirector**: Director class that constructs the computer using the builder.

## How to Run the Demo
The `BuilderPatternDemo.java` class demonstrates how different types of computers are built using the builder pattern.

To run the demo:
1. Navigate to the directory `DesignPatterns\Creational\Builder`.
2. Compile the Java files: `javac *.java`.
3. Run the demo: `java BuilderPatternDemo`.
