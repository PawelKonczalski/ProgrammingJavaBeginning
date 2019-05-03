package com.sdacademy.Zadanie8;

public class Person {
    private String firstName;
    private String lastName;
    private Sex sex;

    public Person(String firstName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
            return "Imie: " + firstName +
                " | Nazwisko: " + lastName +
                " | Płeć: " + sex;

    }
}
