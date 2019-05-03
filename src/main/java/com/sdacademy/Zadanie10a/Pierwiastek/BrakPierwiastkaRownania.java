package com.sdacademy.Zadanie10a.Pierwiastek;

public class BrakPierwiastkaRownania implements PierwiastekRownania {
    private double delta;
    private double a;
    private double b;
    private double c;

    public BrakPierwiastkaRownania(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obliczenieDelte() {
        delta = (Math.pow(b, 2)) - (4 * a * c);
        return delta;
    }

    @Override
    public void pokazWynik() {
        if(delta < 0) {
            System.out.println("Równanie nie ma rozwiązań");
        }
        else if(delta == 0)
            System.out.println("Zastosuj metode PojedynczyPierwiastekRownania");
        else if(delta > 0)
            System.out.println("Zastosuj metode PodwojnyPierwiastekRownania");
    }

    @Override
    public String toString() {
        return "Rówanie "+ a + "x^2 + " + b + "x + " + c + " =0";
    }



}
