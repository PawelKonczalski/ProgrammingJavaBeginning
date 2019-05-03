package com.sdacademy.Zadanie9;

public class Wektor{
    private int a;
    private int b;
    private int x;
    private int y;


    public Wektor(int a, int b) {
        this.a = a;
        this.b = b;
    }



    public int wspolzedneWektora(Punkt punkt1, Punkt punkt2){
        a = punkt2.getX() - punkt1.getX();
        b = punkt2.getY() - punkt1.getY();
        return a;
    }


    @Override
    public String toString() {
        return "[" + a + " ; " + b +']';
    }
}
