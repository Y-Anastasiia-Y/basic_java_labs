package com.yeris.model;

public abstract class NamedModel {
    protected final String name;

    public NamedModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
