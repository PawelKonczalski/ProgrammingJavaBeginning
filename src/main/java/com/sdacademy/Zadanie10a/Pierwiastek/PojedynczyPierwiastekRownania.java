package com.sdacademy.Zadanie10a.Pierwiastek;

public class PojedynczyPierwiastekRownania implements PierwiastekRownania {
    private double x1;
    private double x2;
    private double delta;
    private double a;
    private double b;
    private double c;

    public PojedynczyPierwiastekRownania(double a, double b, double c) {
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
        if(delta == 0) {
            x1 = -b / (2 * a);
            System.out.printf("x1 = %-10.2f\n",x1);
        }
        else if(delta > 0)
            System.out.println("Zastosuj metode PodwojnyPierwiastekRownania");
        else if(delta < 0)
            System.out.println("Zastosuj metode BrakPierwiastkaRownania");
    }

    @Override
    public String toString() {
        return "Rówanie "+ a + "x^2 + " + b + "x + " + c + " =0";
    }


}
