package com.sdacademy.Zadanie9;

public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(2,2);
        Punkt punkt2 = new Punkt(-2,-4);
        System.out.println("Współżedne punktu1: " + punkt1);
        System.out.println("Współżedne punktu2: " + punkt2);
        System.out.println("Odległość między punktami wynosi: " + punkt1.odleglosc(punkt2));
        System.out.println();
        Wektor wektor1 = new Wektor(2,2);
        Wektor wektor2 = new Wektor(3,3);
        Wektor wektor3 = new Wektor(0,0);
        System.out.println("Współżedne wektora1: " + wektor1);
        System.out.println("Współżedne wektora2: " + wektor2);
        System.out.println();
        wektor3.wspolzedneWektora(punkt1,punkt2);
        System.out.println("Współżedne wektora na podstawie punktu1 i punktu2: " + wektor3);

    }
}
