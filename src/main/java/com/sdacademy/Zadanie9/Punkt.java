package com.sdacademy.Zadanie9;


public class Punkt {
    private int x;
    private int y;
    private int odlegloscMiedzyPunktami;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int odleglosc(Punkt innyPunkt)
    {
        odlegloscMiedzyPunktami = (int)Math.sqrt((int)Math.pow((x-innyPunkt.x),2)+ (int)Math.pow((y-innyPunkt.y),2));
        return odlegloscMiedzyPunktami;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
