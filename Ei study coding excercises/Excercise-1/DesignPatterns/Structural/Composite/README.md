# Composite Pattern

## Overview
The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

## Use Case
File system with files and directories.

## Classes

### Interfaces
- **FileSystemComponent**: Interface for file system components.

### Concrete Classes
- **File**: Leaf component representing a file.
- **Directory**: Composite component representing a directory that can contain files or other directories.

## How to Run the Demo
The `CompositePatternDemo.java` class demonstrates how to use the composite pattern to represent a file system structure.

To run the demo:
1. Navigate to the directory `DesignPatterns\Structural\Composite`.
2. Compile the Java files: `javac *.java`.
3. Run the demo: `java CompositePatternDemo`.
