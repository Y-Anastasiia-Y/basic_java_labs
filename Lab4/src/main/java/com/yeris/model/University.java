package com.yeris.model;

import java.util.ArrayList;
import java.util.List;

public class University extends HeadedModel {
    private final List<Faculty> faculties;

    public University(String name, Human head) {
        super(name, head);
        if (head == null) {
            throw new IllegalArgumentException("Head cannot be null");
        }
        this.faculties = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        University model = (University) obj;
        return super.equals(obj) &&
                faculties.equals(model.faculties);
    }

    public void addFaculty(Faculty faculty) {
        if (faculty != null) {
            this.faculties.add(faculty);
        }
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
