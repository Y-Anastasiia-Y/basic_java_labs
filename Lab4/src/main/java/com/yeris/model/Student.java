package com.yeris.model;

public class Student extends Human {
    private final String studentId;

    public Student(String firstName, String lastName, String middleName, Sex sex, String studentId) {
        super(firstName, lastName, middleName, sex);
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        Student model = (Student) obj;
        return super.equals(obj) &&
                studentId.equals(model.studentId);
    }

    public String getStudentId() {
        return studentId;
    }
}
