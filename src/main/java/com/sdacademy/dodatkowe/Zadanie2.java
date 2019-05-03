package com.sdacademy.dodatkowe;

public class Zadanie2 {
    public static void main(String[] args) {
        int n = 3;

        int size = 1;
        if (n == 1)
            size = 1;
        else {
            for (int i = 1; i < n; i++)
                size += 4;
        }

        String[][] ramka = new String[size][size];
        for (int row = 0; row < ramka.length; row++) {
            for (int column = 0; column < ramka.length; column++) {
                if ((column == 0 || column == ramka.length - 1 || row == 0 || row == ramka.length - 1))
                    ramka[row][column] = "#";
                else
                    ramka[row][column] = " ";

                int x = 0;
                for (int multiRamka = 0; multiRamka <= n - 2; multiRamka++) {
                    x += 2;

                    if ((column == x && row > x - 1 && row < ramka.length - x) ||
                            (column == ramka.length - (x + 1) && row > x - 1 && row < ramka.length - x) ||
                            (row == x && column > x - 1 && column < ramka.length - x) ||
                            (row == ramka.length - (x + 1) && column > x - 1 && column < ramka.length - x))
                        ramka[row][column] = "#";

                }
                System.out.print(ramka[row][column]);
            }
            System.out.println();
        }
    }
}

