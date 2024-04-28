package com.yeris.model;

public abstract class HeadedModel extends NamedModel {
    protected final Human head;

    public HeadedModel(String name, Human head) {
        super(name);
        this.head = head;
    }

    public Human getHead() {
        return head;
    }
}
