package com.yeris.controller;

import com.yeris.model.Human;
import com.yeris.model.University;

public class UniversityCreator {
    public static University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}