package com.yeris.model;

public abstract class NamedModel {
    private final String name;

    public NamedModel(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        NamedModel model = (NamedModel) obj;
        return name.equals(model.name);
    }

    public String getName() {
        return name;
    }
}
