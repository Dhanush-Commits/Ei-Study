package com.edtech.util;

public class HelpUtils {

    public static void displayHelp() {
        System.out.println("Virtual Classroom Manager");
        System.out.println();
        System.out.println("Available commands:");
        System.out.println("  add_classroom [Class Name] - Adds a new classroom.");
        System.out.println("  add_student [Student ID] [Student Name] [Class Name] - Adds a new student to a classroom.");
        System.out.println("  schedule_assignment [Assignment Title] [Class Name] [Due Date] - Schedules an assignment for a classroom.");
        System.out.println("  submit_assignment [Student ID] [Assignment Title] - Submits an assignment for a student.");
        System.out.println("  list_assignments [Class Name] - Lists all assignments for a classroom.");
        System.out.println("  list_classes - Lists all classrooms.");
        System.out.println("  list_students [Class Name] - Lists all students in a classroom.");
        System.out.println("  remove_classroom [Class Name] - Removes a classroom.");
        System.out.println("  remove_student [Student ID] - Removes a student.");
        System.out.println("  remove_assignment [Assignment Title] - Removes an assignment.");
        System.out.println("Additional Features:");
        System.out.println("  schedule_assignment [Assignment Title] [Class Name] [Due Date YYYY-MM-DD] - Schedules an assignment for a classroom.");
        System.out.println("  grade_assignment [Assignment Title] [Student ID] [Grade] - Grades an assignment for a student.");
        System.out.println("  search_student [Student ID] - Searches for a student by ID.");
        System.out.println("  help - Displays this help message.");
        System.out.println("  exit - Exits the application.");
    }
}
