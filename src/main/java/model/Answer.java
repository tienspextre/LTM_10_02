package model;

import java.io.Serializable;

public class Answer implements Serializable {
    static final long serialVersionUID = 1L;
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Answer() {
        // Default constructor
    }
}
