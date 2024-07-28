package com.edtech.service;

import com.edtech.model.Classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomService {
    private List<Classroom> classrooms = new ArrayList<>();

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public Classroom getClassroomByName(String name) {
        for (Classroom classroom : classrooms) {
            if (classroom.getName().equals(name)) {
                return classroom;
            }
        }
        return null;
    }

    public List<Classroom> getAllClassrooms() {
        return classrooms;
    }

    public void removeClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }
}
