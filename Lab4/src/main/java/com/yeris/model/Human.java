package com.yeris.model;

public class Human extends NamedModel {
    private final String surname;
    private final Sex sex;

    public Human(String name, String surname, String middleName, Sex sex) {
        super(name);
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        Human model = (Human) obj;
        return super.equals(obj) &&
                surname.equals(model.surname) &&
                sex.equals(model.sex);
    }

    public String getSurname() {
        return surname;
    }

    public Sex getSex() {
        return sex;
    }
}
