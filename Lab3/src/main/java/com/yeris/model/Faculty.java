package com.yeris.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends HeadedModel {
    private final List<Cathedra> departments;

    public Faculty(String name, Human head) {
        super(name, head);
        if (head == null) {
            throw new IllegalArgumentException("Head cannot be null");
        }
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Cathedra cathedra) {
        if (cathedra != null) {
            this.departments.add(cathedra);
        }
    }

    public List<Cathedra> getDepartments() {
        return departments;
    }
}
