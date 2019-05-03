package com.sdacademy.Zadanie8;

public enum Sex {
    MALE("male"),
    FEMALE("famake");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
