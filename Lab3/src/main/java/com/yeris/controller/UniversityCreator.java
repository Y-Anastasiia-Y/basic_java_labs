package com.yeris.controller;

import com.yeris.model.*;

public class UniversityCreator {
    public static University createUniversity(String name, Human head) {
        return new University(name, head);
    }

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

}