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

    @Override
    public boolean equals(Object obj) {
        Faculty model = (Faculty) obj;
        return super.equals(obj) &&
                departments.equals(model.departments);
    }

    public void addDepartment(Cathedra department) {
        if (department != null) {
            this.departments.add(department);
        }
    }

    public List<Cathedra> getDepartments() {
        return departments;
    }
}
