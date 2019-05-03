package com.sdacademy.Zadanie2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int a, n, potęgowanie;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaej liczbę całkowitą: ");
        a = scanner.nextInt();
        System.out.print("Do której potęgi podnieść liczbę: ");
        n = scanner.nextInt();
        potęgowanie = power(a, n);

        System.out.println("Wynik działania: ");
        System.out.println(a + "^" + n + " = " + potęgowanie);
    }

    public static int power(int a, int n) {
        int iloczyn;
        iloczyn = (int)Math.pow(a,n);
        return iloczyn;

    }
}
