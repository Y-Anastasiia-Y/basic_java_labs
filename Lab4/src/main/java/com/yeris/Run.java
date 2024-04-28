package com.yeris;

import com.yeris.controller.*;
import com.yeris.model.*;

public class Run {
    public static University createTypicalUniversity() {
        // Створення голови університету
        Human universityHead = new Human("Олександр", "Петров", "Васильович", Sex.MALE);

        // Створення університету
        University university = UniversityCreator.createUniversity("Київський Національний Університет", universityHead);

        // Створення факультету
        Human facultyHead = new Human("Марія", "Іванова", "Іванівна", Sex.FEMALE);
        Faculty faculty = FacultyCreator.createFaculty("Факультет Фізики", facultyHead);

        // Створення кафедри
        Human departmentHead = new Human("Ігор", "Сидоренко", "Сергійович", Sex.MALE);
        Cathedra department = CathedraCreator.createDepartment("Кафедра Теоретичної Фізики", departmentHead);

        // Створення групи
        Human groupHead = new Human("Анна", "Мельник", "Олексіївна", Sex.FEMALE);
        Group group = GroupCreator.createGroup("Група 101", groupHead);

        // Створення студентів
        Student student1 = StudentCreator.createStudent("Максим", "Гончар", "Ігорович", Sex.MALE, "101-01");
        Student student2 = StudentCreator.createStudent("Олена", "Шевченко", "Петрівна", Sex.FEMALE, "101-02");

        // Додавання студентів до групи
        group.addStudent(student1);
        group.addStudent(student2);

        // Додавання групи до кафедри
        department.addGroup(group);

        // Додавання кафедри до факультету
        faculty.addDepartment(department);

        // Додавання факультету до університету
        university.addFaculty(faculty);

        return university;
    }

    public static void main(String[] args) {
        University university = createTypicalUniversity();

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
