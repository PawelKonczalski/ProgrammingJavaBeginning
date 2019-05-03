package com.sdacademy.Zadanie8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class PersonNoMandatory extends Person {

    private int height;
    private int weight;
    private String birthDate;
    private String[] interests;

    public PersonNoMandatory(String firstName, String lastName, Sex sex, int height, int weight, String birthDate, String... interests) {
        super(firstName, lastName, sex);
        this.height = height;
        this.weight = weight;
        this.interests = interests;

        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.parse(birthDate, dateTimeFormatter);
            this.birthDate = localDate.format(dateTimeFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Podaj date w formacie yyyy/MM/dd");
        }
    }

    @Override
    public String toString() {
        return "Imie: " + getFirstName() +
                " | Nazwisko: " + getLastName() +
                " | Płeć: " + getSex() +
                " | Wzrost: " + height + "cm " +
                "| Waga: " + weight + "kg " +
                "| Data urodzenia: " + birthDate +
                " | Zainteresowania: " + Arrays.toString(interests);
    }
}
