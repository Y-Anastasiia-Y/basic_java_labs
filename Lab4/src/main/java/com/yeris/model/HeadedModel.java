package com.yeris.model;

public abstract class HeadedModel extends NamedModel {
    private final Human head;

    public HeadedModel(String name, Human head) {
        super(name);
        this.head = head;
    }

    @Override
    public boolean equals(Object obj) {
        HeadedModel model = (HeadedModel) obj;
        return super.equals(obj) &&
                head.equals(model.head);
    }

    public Human getHead() {
        return head;
    }
}
