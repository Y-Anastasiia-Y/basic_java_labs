package com.yeris.controller;

import com.yeris.model.Cathedra;
import com.yeris.model.Human;

public class CathedraCreator {
    public static Cathedra createDepartment(String name, Human head) {
        return new Cathedra(name, head);
    }
}
