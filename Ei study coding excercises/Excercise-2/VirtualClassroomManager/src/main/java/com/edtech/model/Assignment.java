package com.edtech.model;

public class Assignment {
    private String title;
    private Classroom classroom;
    private String dueDate;
    private String grade;

    public Assignment(String title, Classroom classroom, String dueDate) {
        this.title = title;
        this.classroom = classroom;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
