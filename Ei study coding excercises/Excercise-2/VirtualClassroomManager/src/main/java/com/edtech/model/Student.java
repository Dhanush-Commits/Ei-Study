package com.edtech.model;

public class Student {
    private String id;
    private String name;
    private Classroom classroom;

    public Student(String id, String name, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}
