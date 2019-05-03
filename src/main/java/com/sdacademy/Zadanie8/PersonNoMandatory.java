package com.sdacademy.Zadanie8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String dateInString = birthDate;
            Date date = formatter.parse(dateInString);
            this.birthDate = birthDate;
        } catch (ParseException e) {
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
