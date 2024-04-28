package com.yeris;

import com.yeris.controller.UniversityCreator;
import com.yeris.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonManagerTest {
    @Test
    public void testJsonSerialization() throws IOException {

        University oldUniversity = UniversityCreator.createTypicalUniversity();

        // Збереження університету у файл
        String filePath = "university.json";
        JsonManager.saveUniversityToJson(oldUniversity, filePath);

        // Зчитування університету з файлу
        University newUniversity = JsonManager.loadUniversityFromJson(filePath);

        // Порівняння університетів
        assertEquals(oldUniversity, newUniversity);
    }
}