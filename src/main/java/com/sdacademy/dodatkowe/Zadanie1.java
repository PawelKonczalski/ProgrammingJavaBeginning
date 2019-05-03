package com.sdacademy.dodatkowe;

public class Zadanie1 {
    public static void main(String[] args) {
        int k = 5;
        int n = 4;
        String[][] szachownica = new String[n][n];
        for (int row = 0; row < szachownica.length; row++) {
            for (int duplication = 0; duplication < k; duplication++) {
                for (int column = 0; column < szachownica.length; column++) {
                    if (column == row || (column + row) % 2 == 0) {
                        szachownica[row][column] = "*";
                        for (int duplication1 = 1; duplication1 < k; duplication1++)
                            szachownica[row][column] += "*";
                    } else {
                        szachownica[row][column] = "#";
                        for (int duplication2 = 1; duplication2 < k; duplication2++)
                            szachownica[row][column] += "#";
                    }
                    System.out.print(szachownica[row][column]);
                }
                System.out.println();
            }
        }
    }
}
