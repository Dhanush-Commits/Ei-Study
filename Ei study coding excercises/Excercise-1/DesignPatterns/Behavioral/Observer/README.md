# Observer Pattern

## Overview
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Use Case
A social media platform where users can follow posts, comments, and likes.

## Classes

### Interfaces
- **Observable**: Interface for objects that can be observed.
- **Observer**: Interface for objects that observe.

### Concrete Classes
- **Post**: Concrete Observable class representing a post.
- **Comment**: Concrete Observable class representing a comment.
- **Like**: Concrete Observable class representing a like.
- **RegularUser**: Concrete Observer class representing a regular user.
- **VIPUser**: Concrete Observer class representing a VIP user.

## How to Run the Demo
The `ObserverPatternDemo.java` class demonstrates how updates to posts, comments, or likes trigger notifications to subscribed observers.

To run the demo:
1. Navigate to the directory `DesignPatterns\Behavioral\Observer`.
2. Compile the Java files: `javac *.java`.
3. Run the demo: `java ObserverPatternDemo`.