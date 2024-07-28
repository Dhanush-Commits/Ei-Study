# Facade Pattern

## Overview
The Facade Pattern provides a simplified interface to a complex subsystem. It defines a higher-level interface that makes the subsystem easier to use.

## Use Case
Home automation system to control lights, air conditioner, and security system.

## Classes

### Subsystem Classes
- **Lights**: Class for controlling lights.
- **AirConditioner**: Class for controlling air conditioner.
- **SecuritySystem**: Class for controlling security system.

### Facade Class
- **HomeAutomationFacade**: Facade class that simplifies interaction with the subsystems.

## How to Run the Demo
The `FacadePatternDemo.java` class demonstrates how the facade simplifies the process of controlling the home automation system.

To run the demo:
1. Navigate to the directory `DesignPatterns\Structural\Facade`.
2. Compile the Java files: `javac *.java`.
3. Run the demo: `java FacadePatternDemo`.
