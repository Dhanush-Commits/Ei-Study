# Chain of Responsibility Pattern

## Overview
The Chain of Responsibility Pattern allows an object to send a command without knowing which object will handle the request. The request is passed along a chain of objects until it is handled.

## Use Case
A customer support system with different support levels (Level 1, Level 2, Level 3).

## Classes

### Abstract Class
- **SupportHandler**: Abstract handler class.

### Concrete Classes
- **Level1Support**: Concrete handler class for level 1 support.
- **Level2Support**: Concrete handler class for level 2 support.
- **Level3Support**: Concrete handler class for level 3 support.

## How to Run the Demo
The `ChainOfResponsibilityDemo.java` class demonstrates how requests are passed along the chain of handlers until they are handled.

To run the demo:
1. Navigate to the directory `DesignPatterns\Behavioral\ChainOfResponsibility`.
2. Compile the Java files: `javac *.java`.
3. Run the demo: `java ChainOfResponsibilityDemo`
