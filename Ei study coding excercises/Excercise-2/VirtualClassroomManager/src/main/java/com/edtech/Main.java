package com.edtech;

import com.edtech.model.*;
import com.edtech.service.*;
import com.edtech.util.HelpUtils;
import com.edtech.util.LoggerUtil;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final ClassroomService classroomService = new ClassroomService();
    private static final StudentService studentService = new StudentService();
    private static final AssignmentService assignmentService = new AssignmentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelpUtils.displayHelp();
        readCommand(scanner);
    }

    private static void readCommand(Scanner scanner) {
        System.out.print("Enter command: ");
        String command = scanner.nextLine().trim();
        if ("exit".equalsIgnoreCase(command)) {
            System.out.println("Exiting...");
            return;
        }
        try {
            processCommand(command);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        readCommand(scanner);
    }

    private static void processCommand(String command) {
        String[] parts = command.split(" ", 2);
        String action = parts[0];

        switch (action) {
            case "add_classroom":
                addClassroom(parts);
                break;
            case "add_student":
                addStudent(parts);
                break;
            case "schedule_assignment":
                scheduleAssignment(parts);
                break;
            case "submit_assignment":
                submitAssignment(parts);
                break;
            case "grade_assignment":
                gradeAssignment(parts);
                break;
            case "list_assignments":
                listAssignments(parts);
                break;
            case "list_classes":
                listClasses();
                break;
            case "list_students":
                listStudents(parts);
                break;
            case "remove_classroom":
                removeClassroom(parts);
                break;
            case "remove_student":
                removeStudent(parts);
                break;
            case "remove_assignment":
                removeAssignment(parts);
                break;
            case "search_student":
                searchStudent(parts);
                break;
            case "help":
                HelpUtils.displayHelp();
                break;
            default:
                System.out.println("Invalid command. Please try again.");
        }
    }

    private static void addClassroom(String[] parts) {
        List<Classroom> classrooms = classroomService.getAllClassrooms();
        if (parts.length < 2) {
            System.out.println("Usage: add_classroom [Class Name]");
            return;
        }
        
        String className = parts[1];
        
        for (Classroom class1 : classrooms) {
            if (class1.getName().equalsIgnoreCase(className)) {
                LoggerUtil.log("Classroom already exists: " + className);
                return;
            }
        }
        Classroom classroom = new Classroom(className);
        classroomService.addClassroom(classroom);
        System.out.println("Classroom added: " + className);
        LoggerUtil.log("Classroom added: " + className);
    }

    private static void addStudent(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: add_student [Student ID] [Student Name] [Class Name]");
            return;
        }

        String[] studentDetails = parts[1].split(" ", 3);
        if (studentDetails.length < 3) {
            System.out.println("Usage: add_student [Student ID] [Student Name] [Class Name]");
            return;
        }

        String studentId = studentDetails[0];
        String studentName = studentDetails[1];
        String className = studentDetails[2];

        Classroom classroom = classroomService.getClassroomByName(className);
        if (classroom == null) {
            System.out.println("Classroom not found: " + className);
            return;
        }

        Student student = new Student(studentId, studentName, classroom);
        studentService.addStudent(student);
        System.out.println("Student added: " + studentId + " to " + className);
        LoggerUtil.log("Student added: " + studentId + " to " + className);
    }

    private static void scheduleAssignment(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: schedule_assignment [Assignment Title] [Class Name] [Due Date (yyyy-MM-dd)]");
            return;
        }

        String[] assignmentDetails = parts[1].split(" ", 3);
        if (assignmentDetails.length < 3) {
            System.out.println("Usage: schedule_assignment [Assignment Title] [Class Name] [Due Date (yyyy-MM-dd)]");
            return;
        }

        String assignmentTitle = assignmentDetails[0];
        String className = assignmentDetails[1];
        String dueDateString = assignmentDetails[2];

        LocalDate dueDate;
        try {
            dueDate = LocalDate.parse(dueDateString);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return;
        }

        if (dueDate.isBefore(LocalDate.now()) || dueDate.isEqual(LocalDate.now())) {
            System.out.println("Due date must be in the future and not today.");
            return;
        }

        Classroom classroom = classroomService.getClassroomByName(className);
        if (classroom == null) {
            System.out.println("Classroom not found: " + className);
            return;
        }

        Assignment assignment = new Assignment(assignmentTitle, classroom, dueDate.toString());
        assignmentService.addAssignment(assignment);
        System.out.println("Assignment scheduled: " + assignmentTitle + " for " + className);
        LoggerUtil.log("Assignment scheduled: " + assignmentTitle + " for " + className);
    }

    private static void submitAssignment(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: submit_assignment [Student ID] [Assignment Title]");
            return;
        }

        String[] submitDetails = parts[1].split(" ", 2);
        if (submitDetails.length < 2) {
            System.out.println("Usage: submit_assignment [Student ID] [Assignment Title]");
            return;
        }

        String studentId = submitDetails[0];
        String assignmentTitle = submitDetails[1];

        Student student = studentService.getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found: " + studentId);
            return;
        }

        Assignment assignment = assignmentService.getAssignmentByTitle(assignmentTitle);
        if (assignment == null) {
            System.out.println("Assignment not found: " + assignmentTitle);
            return;
        }

        assignmentService.submitAssignment(student, assignment);
        System.out.println("Assignment submitted: " + assignmentTitle + " by " + studentId);
        LoggerUtil.log("Assignment submitted: " + assignmentTitle + " by " + studentId);
    }

    private static void gradeAssignment(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: grade_assignment [Assignment Title] [Student ID] [Grade]");
            return;
        }

        String[] gradeDetails = parts[1].split(" ", 3);
        if (gradeDetails.length < 3) {
            System.out.println("Usage: grade_assignment [Assignment Title] [Student ID] [Grade]");
            return;
        }

        String assignmentTitle = gradeDetails[0];
        String studentId = gradeDetails[1];
        String grade = gradeDetails[2];

        Assignment assignment = assignmentService.getAssignmentByTitle(assignmentTitle);
        if (assignment == null) {
            System.out.println("Assignment not found: " + assignmentTitle);
            return;
        }

        Student student = studentService.getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found: " + studentId);
            return;
        }

        assignmentService.setGrade(assignment, student, grade);
        System.out.println("Assignment graded: " + assignmentTitle + " for " + studentId + " with grade " + grade);
        LoggerUtil.log("Assignment graded: " + assignmentTitle + " for " + studentId + " with grade " + grade);
    }

    private static void listAssignments(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: list_assignments [Class Name]");
            return;
        }
        String className = parts[1];
        Classroom classroom = classroomService.getClassroomByName(className);
        if (classroom == null) {
            System.out.println("Classroom not found: " + className);
            return;
        }

        List<Assignment> assignments = assignmentService.getAssignmentsByClassroom(classroom);
        if (assignments.isEmpty()) {
            System.out.println("No assignments are scheduled for " + className);
        } else {
            for (Assignment assignment : assignments) {
                System.out.println("Assignment Title: " + assignment.getTitle() + ", Due Date: " + assignment.getDueDate());
            }
        }
    }

    private static void listClasses() {
        List<Classroom> classrooms = classroomService.getAllClassrooms();
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            for (Classroom classroom : classrooms) {
                System.out.println("Classroom Name: " + classroom.getName());
            }
        }
    }

    private static void listStudents(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: list_students [Class Name]");
            return;
        }
        String className = parts[1];
        Classroom classroom = classroomService.getClassroomByName(className);
        if (classroom == null) {
            System.out.println("Classroom not found: " + className);
            return;
        }

        List<Student> students = studentService.getStudentsByClassroom(classroom);
        if (students.isEmpty()) {
            System.out.println("No students found in " + className);
        } else {
            for (Student student : students) {
                System.out.println("Student ID: " + student.getId() + ", Student Name: " + student.getName());
            }
        }
    }

    private static void removeClassroom(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: remove_classroom [Class Name]");
            return;
        }
        String className = parts[1];
        Classroom classroom = classroomService.getClassroomByName(className);
        if (classroom == null) {
            System.out.println("Classroom not found: " + className);
            return;
        }

        classroomService.removeClassroom(classroom);
        assignmentService.removeAssignmentsByClassroom(classroom);
        System.out.println("Classroom removed: " + className);
        LoggerUtil.log("Classroom removed: " + className);
    }

    private static void removeStudent(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: remove_student [Student ID]");
            return;
        }
        String studentId = parts[1];
        Student student = studentService.getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found: " + studentId);
            return;
        }

        studentService.removeStudent(student);
        System.out.println("Student removed: " + studentId);
        LoggerUtil.log("Student removed: " + studentId);
    }

    private static void removeAssignment(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: remove_assignment [Assignment Title]");
            return;
        }
        String assignmentTitle = parts[1];
        Assignment assignment = assignmentService.getAssignmentByTitle(assignmentTitle);
        if (assignment == null) {
            System.out.println("Assignment not found: " + assignmentTitle);
            return;
        }

        assignmentService.removeAssignment(assignment);
        System.out.println("Assignment removed: " + assignmentTitle);
        LoggerUtil.log("Assignment removed: " + assignmentTitle);
    }

    private static void searchStudent(String[] parts) {
        if (parts.length < 2) {
            System.out.println("Usage: search_student [Student ID]");
            return;
        }
        String studentId = parts[1];
        Student student = studentService.getStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found: " + studentId);
        } else {
            System.out.println("Student ID: " + student.getId() + ", Student Name: " + student.getName() +
                    ", Class: " + student.getClassroom().getName());
        }
    }
}
