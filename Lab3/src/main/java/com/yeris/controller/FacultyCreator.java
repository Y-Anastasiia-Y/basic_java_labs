package com.yeris.controller;

import com.yeris.model.Faculty;
import com.yeris.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
