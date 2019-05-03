package com.sdacademy.Zadanie5;

import java.util.Scanner;

public class Zadanie5a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaGwiazdek;
        System.out.print("Podaj ilość gwiazdek: ");
        liczbaGwiazdek = scanner.nextInt();
        String gwiazdka = "";
        for (int i = liczbaGwiazdek; i > 0; i--) {
            for (int j = i; j < liczbaGwiazdek; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                gwiazdka += '*';

            }

            System.out.println(gwiazdka);
            gwiazdka = "";
        }
    }
}
