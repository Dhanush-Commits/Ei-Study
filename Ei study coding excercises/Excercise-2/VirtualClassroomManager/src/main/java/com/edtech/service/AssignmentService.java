package com.edtech.service;

import com.edtech.model.Assignment;
import com.edtech.model.Classroom;
import com.edtech.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AssignmentService {
    private List<Assignment> assignments = new ArrayList<>();

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public Assignment getAssignmentByTitle(String title) {
        for (Assignment assignment : assignments) {
            if (assignment.getTitle().equals(title)) {
                return assignment;
            }
        }
        return null;
    }

    public List<Assignment> getAssignmentsByClassroom(Classroom classroom) {
        List<Assignment> result = new ArrayList<>();
        for (Assignment assignment : assignments) {
            if (assignment.getClassroom().equals(classroom)) {
                result.add(assignment);
            }
        }
        return result;
    }

    public void submitAssignment(Student student, Assignment assignment) {
        System.out.println("Assignment submitted by " + student.getName() + ": " + assignment.getTitle());
    }

    public void setGrade(Assignment assignment, Student student, String grade) {
        assignment.setGrade(grade);
    }

    public void removeAssignment(Assignment assignment) {
        assignments.remove(assignment);
    }

    public void removeAssignmentsByClassroom(Classroom classroom) {
        assignments.removeIf(assignment -> assignment.getClassroom().equals(classroom));
    }
}
