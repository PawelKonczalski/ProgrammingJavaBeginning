package com.sdacademy.Zadanie10;

public class ObliczaniePierwiastków {
    private double a;
    private double b;
    private double c;
    private double delta, x1, x2;

    public ObliczaniePierwiastków(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] obliczPierwiastki() {
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

    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }
}
