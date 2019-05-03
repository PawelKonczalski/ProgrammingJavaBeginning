package com.sdacademy.Zadanie10;

import java.lang.reflect.Array;

public class Zadanie10 {
    public static void main(String[] args) {

        System.out.print("Program obliczba równanie " );
        for(double wynik: obliczPierwiastki(10, 15, 5))
        System.out.println("x = " +wynik);

        System.out.println("\n\n");

        ObliczaniePierwiastków pier = new ObliczaniePierwiastków(10,15,5);
        System.out.println(pier);
        for(double wynik: pier.obliczPierwiastki())
        System.out.println("x = " + wynik);
    }

    public static double[] obliczPierwiastki(double a, double b, double c) {
        System.out.println(a+"x^2 + "+b + "x + " +c +" = 0");
        double delta, x1, x2;
        delta = (Math.pow(b, 2)) - (4 * a * c);
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            double[] tablica = {x1, x2};
            return tablica;
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            double[] tablica = {x1};
            return tablica;
        } else
            System.out.println("Brak rozwiązań");
        double[] tablica = {};
        return tablica;

    }
}
