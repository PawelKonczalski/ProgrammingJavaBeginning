package com.sdacademy.Zadanie7;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.print("Podaj rozmiar tablicy: ");
        n = scanner.nextInt();
        String[][] szach = new String[n][n];
        for (int x = 0; x < szach.length; x++) {
            for (int z = 0; z < 2; z++) {
                for (int y = 0; y < szach.length; y++) {
                    if (x == y || (x + y) % 2 == 0)
                        szach[x][y] = "**";
                    else
                        szach[x][y] = "##";
                    System.out.print(szach[x][y]);
                }
                System.out.println();
            }
        }
    }
}
