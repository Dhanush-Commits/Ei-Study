package com.edtech.service;

import com.edtech.model.Classroom;
import com.edtech.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudentsByClassroom(Classroom classroom) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getClassroom().equals(classroom)) {
                result.add(student);
            }
        }
        return result;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}
