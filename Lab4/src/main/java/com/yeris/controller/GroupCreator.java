package com.yeris.controller;

import com.yeris.model.Group;
import com.yeris.model.Human;

public class GroupCreator {
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}
