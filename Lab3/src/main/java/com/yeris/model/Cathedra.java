package com.yeris.model;

import java.util.ArrayList;
import java.util.List;

public class Cathedra extends HeadedModel {
    private final List<Group> groups;

    public Cathedra(String name, Human head) {
        super(name, head);
        if (head == null) {
            throw new IllegalArgumentException("Head cannot be null");
        }
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        if (group != null) {
            this.groups.add(group);
        }
    }

    public List<Group> getGroups() {
        return groups;
    }
}
