package com.yeris.model;

public class Human extends NamedModel {
    private final String surname;
    private final String middleName;
    private final Sex sex;

    public Human(String name, String surname, String middleName, Sex sex) {
        super(name);
        this.surname = surname;
        this.middleName = middleName;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Sex getSex() {
        return sex;
    }
}
