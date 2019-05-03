package com.sdacademy.Zadanie5;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaGwiazdek;
        System.out.print("Podaj ilość gwiazdek: ");
        liczbaGwiazdek = scanner.nextInt();
        String gwiazdka = "";
        for (int i = liczbaGwiazdek; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                gwiazdka += '*';
            }
            System.out.println(gwiazdka);
            gwiazdka = "";
        }
    }
}
