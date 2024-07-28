# Virtual Classroom Manager

## Overview
The Virtual Classroom Manager is a console-based application designed to manage virtual classrooms, students, and assignments. The application supports various functionalities such as adding/removing classrooms, students, scheduling and grading assignments, and more.

## Features
- Add and remove classrooms
- Add and remove students
- Schedule assignments for classrooms
- Submit and grade assignments
- List assignments, classrooms, and students
- Search for students by ID
- Display help with available commands

## Prerequisites
- Java Development Kit (JDK) 8 or later

## Installation

### Step 1: Install JDK
- Download JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or [OpenJDK](https://openjdk.java.net/).
- Follow the installation instructions for your operating system.
- Set the `JAVA_HOME` environment variable to point to the JDK installation directory.

### Step 2: Install Apache Maven (optional)
- Download Maven from the [Maven website](https://maven.apache.org/download.cgi).
- Follow the installation instructions for your operating system.
- Add the `bin` directory of the extracted directory to the `PATH` environment variable.

## Project Setup
1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/virtual-classroom-manager.git
    cd virtual-classroom-manager
    ```

2. Build the project using Maven (only required for building, not for running pre-built JAR):
    ```sh
    mvn clean install
    ```
   Alternatively, download the pre-built JAR file from the Releases section of the repository.

## Running the Application
1. Navigate to the directory containing the pre-built JAR file (if you downloaded it):
    ```sh
    cd path/to/jar-file
    ```

2. Run the application using the following command:
    ```sh
    java -jar virtual-classroom-manager.jar
    ```

## Project Directory Structure

```bash
VirtualClassroomManager
  |
  |-- src
  |    |
  |    |-- main
  |    |    |
  |    |    |-- java
  |    |    |    |
  |    |    |    |-- com
  |    |    |    |    |
  |    |    |    |    |-- edtech
  |    |    |    |    |    |
  |    |    |    |    |    |-- Main.java
  |    |    |    |    |    |-- exception
  |    |    |    |    |    |    |
  |    |    |    |    |    |    |-- CustomException.java
  |    |    |    |    |    |    |-- ClassroomNotFoundException.java
  |    |    |    |    |    |-- model
  |    |    |    |    |    |    |
  |    |    |    |    |    |    |-- Assignment.java
  |    |    |    |    |    |    |-- Classroom.java
  |    |    |    |    |    |    |-- Student.java
  |    |    |    |    |    |-- service
  |    |    |    |    |    |    |
  |    |    |    |    |    |    |-- AssignmentService.java
  |    |    |    |    |    |    |-- ClassroomService.java
  |    |    |    |    |    |    |-- StudentService.java
  |    |    |    |    |    |-- util
  |    |    |    |    |    |    |
  |    |    |    |    |    |    |-- LoggingUtility.java
  |    |    |    |    |    |    |-- HelpUtils.java
  |    |    |-- resources
  |    |    |    |
  |    |    |    |-- log4j2.xml
  |-- pom.xml
  |-- README.md
```

## Usage
### Available Commands
- `add_classroom [Class Name]` - Adds a new classroom.
- `add_student [Student ID] [Student Name] [Class Name]` - Adds a new student to a classroom.
- `schedule_assignment [Assignment Title] [Class Name] [Due Date]` - Schedules an assignment for a classroom.
- `submit_assignment [Student ID] [Assignment Title]` - Submits an assignment for a student.
- `grade_assignment [Assignment Title] [Student ID] [Grade]` - Grades an assignment for a student.
- `list_assignments [Class Name]` - Lists all assignments for a classroom.
- `list_classes` - Lists all classrooms.
- `list_students [Class Name]` - Lists all students in a classroom.
- `remove_classroom [Class Name]` - Removes a classroom.
- `remove_student [Student ID]` - Removes a student.
- `remove_assignment [Assignment Title]` - Removes an assignment.
- `search_student [Student ID]` - Searches for a student by ID.
- `help` - Displays this help message.
- `exit` - Exits the application.

### Examples

#### Adding a classroom:
Enter command: add_classroom Math101

#### Adding a student:
Enter command: add_student 001 John Math101

#### Scheduling an assignment:
Enter command: schedule_assignment Homework1 Math101 2024-08-01

#### Submitting an assignment:
Enter command: submit_assignment 001 Homework1

#### Grading an assignment:
Enter command: grade_assignment Homework1 001 A

#### Listing assignments for a classroom:
Enter command: list_assignments Math101

#### Listing all classrooms:
Enter command: list_classes

#### Listing students in a classroom:
Enter command: list_students Math101

#### Removing a classroom:
Enter command: remove_classroom Math101

#### Removing a student:
Enter command: remove_student 001

#### Removing an assignment:
Enter command: remove_assignment Homework1

#### Searching for a student by ID:
Enter command: search_student 001

#### Displaying help:
Enter command: help

#### Exiting the application:
Enter command: exit

## Additional Features
- `remove_assignment [Assignment Title]` - Removes an assignment from the system.
- `search_student [Student ID]` - Searches for a student by their ID.

