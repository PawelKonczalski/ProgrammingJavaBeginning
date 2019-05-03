package com.sdacademy.Zadanie10a;


import com.sdacademy.Zadanie10a.Pierwiastek.BrakPierwiastkaRownania;
import com.sdacademy.Zadanie10a.Pierwiastek.PierwiastekRownania;
import com.sdacademy.Zadanie10a.Pierwiastek.PodwojnyPierwiastekRownania;

public class Main {
    public static void main(String[] args) {
        PierwiastekRownania p1 = new BrakPierwiastkaRownania(2,5,2);
        System.out.println(p1);
        System.out.println("Delta = " +p1.obliczenieDelte());
        p1.pokazWynik();



    }
}
