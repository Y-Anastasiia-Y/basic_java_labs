package com.yeris;

import com.yeris.controller.*;
import com.yeris.model.*;

public class Run {

    public static void main(String[] args) {
        University university = UniversityCreator.createTypicalUniversity();

        // Вивід структури університету
        System.out.println("Університет: " + university.getName());
        System.out.println("Голова університету: " + university.getHead().getName() + " "
                + university.getHead().getSurname());

        for (Faculty faculty : university.getFaculties()) {
            System.out.println("Факультет: " + faculty.getName());
            System.out.println("Голова факультету: " + faculty.getHead().getName() + " "
                    + faculty.getHead().getSurname());

            for (Cathedra department : faculty.getDepartments()) {
                System.out.println("Кафедра: " + department.getName());
                System.out.println("Голова кафедри: " + department.getHead().getName() + " "
                        + department.getHead().getSurname());

                for (Group group : department.getGroups()) {
                    System.out.println("Група: " + group.getName());
                    System.out.println("Голова групи: " + group.getHead().getName() + " "
                            + group.getHead().getSurname());

                    for (Student student : group.getStudents()) {
                        System.out.println("Студент: " + student.getName() + " "
                                + student.getSurname() + " (ID: " + student.getStudentId() + ")");
                    }
                }
            }
        }
    }
}
