package com.sdacademy.Zadanie8;


public class Main {
    public static void main(String[] args) {
        Person osoba1 = new Person("Pawel","Kon",Sex.MALE);
        System.out.println(osoba1);

        Person osoba2 = new PersonNoMandatory("Adam", "Gapa", Sex.MALE, 182, 84, "1991/01/19", "Rower, sanki, grabie");
        System.out.println(osoba2);
    }
}
