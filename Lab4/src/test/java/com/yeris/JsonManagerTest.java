package com.yeris;

import com.yeris.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonManagerTest {
    @Test
    public void testJsonSerialization() throws IOException {
        // Створення університету (oldUniversity) з двома підрозділами на кожному рівні
        Human universityHead = new Human("Іван", "Петров", "Сергійович", Sex.MALE);
        University oldUniversity = new University("Університет 1", universityHead);

        // Створення факультету з двома кафедрами
        Human facultyHead = new Human("Ольга", "Іванова", "Петрівна", Sex.FEMALE);
        Faculty faculty = new Faculty("Факультет 1", facultyHead);

        Human departmentHead1 = new Human("Антон", "Ковальчук", "Андрійович", Sex.MALE);
        Cathedra department1 = new Cathedra("Кафедра 1", departmentHead1);

        Human departmentHead2 = new Human("Катерина", "Дмитрук", "Валентинівна", Sex.FEMALE);
        Cathedra department2 = new Cathedra("Кафедра 2", departmentHead2);

        faculty.addDepartment(department1);
        faculty.addDepartment(department2);

        oldUniversity.addFaculty(faculty);

        // Створення груп з двома студентами
        Human groupHead1 = new Human("Юрій", "Сидорчук", "Ігорович", Sex.MALE);
        Group group1 = new Group("Група 1", groupHead1);

        Human groupHead2 = new Human("Наталія", "Заворотня", "Іванівна", Sex.FEMALE);
        Group group2 = new Group("Група 2", groupHead2);

        Student student1 = new Student("Андрій", "Коваль", "Ігорович", Sex.MALE, "201");
        Student student2 = new Student("Оксана", "Шевченко", "Вікторівна", Sex.FEMALE, "202");

        group1.addStudent(student1);
        group1.addStudent(student2);

        Student student3 = new Student("Іван", "Калитко", "Сергійович", Sex.MALE, "203");
        Student student4 = new Student("Марія", "Ткачук", "Петрівна", Sex.FEMALE, "204");

        group2.addStudent(student3);
        group2.addStudent(student4);

        department1.addGroup(group1);
        department2.addGroup(group2);

        // Збереження університету у файл
        String filePath = "university.json";
        JsonManager.saveUniversityToJson(oldUniversity, filePath);

        // Зчитування університету з файлу
        University newUniversity = JsonManager.loadUniversityFromJson(filePath);

        // Порівняння університетів
        assertEquals(oldUniversity, newUniversity);
    }
}