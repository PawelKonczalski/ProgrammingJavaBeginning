package com.sdacademy.Zadanie6;

import java.util.Scanner;

public class Zadanie6a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Podaj rozmiar ramki: ");
         n = scanner.nextInt();
        String[][] szach = new String[n][n];



        System.out.print( '\u2554' );
        for(int i = 0; i < szach.length; i++)
            System.out.print('\u2550');
        System.out.print('\u2557');

        System.out.println();
        for (int x = 0; x < szach.length; x++) {
            System.out.print('\u2551');
            for (int y = 0; y < szach.length; y++) {
                if (x == y || (x + y) % 2 == 0) {
                    szach[x][y] = "*";
                } else
                    szach[x][y] = "#";
                System.out.print(szach[x][y]);
            }
            System.out.print('\u2551');
            System.out.println();
        }
        System.out.print('\u255A');
        for(int j = 0; j < szach.length; j++)
            System.out.print('\u2550');
        System.out.print('\u255D');
    }
}
