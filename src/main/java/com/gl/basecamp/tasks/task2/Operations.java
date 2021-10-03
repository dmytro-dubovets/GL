package com.gl.basecamp.tasks.task2;

public enum Operations {

    ADD_OPERATION("add"),
    SUBTRACTION_OPERATION("subtraction"),
    MULTIPLY_OPERATION("multiply"),
    DIVISION_OPERATION("division");

    private final String value;

    Operations(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
