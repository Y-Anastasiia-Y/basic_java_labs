package com.yeris.model;

import java.util.ArrayList;
import java.util.List;

public class Group extends HeadedModel {
    private final List<Student> students;

    public Group(String name, Human head) {
        super(name, head);
        if (head == null) {
            throw new IllegalArgumentException("Head cannot be null");
        }
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
