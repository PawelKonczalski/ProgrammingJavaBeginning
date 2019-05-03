package com.sdacademy.Zadanie3;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = {4, 7, 6, 2, 33, 8};
        System.out.println("Tablica startowa: ");
        System.out.print("[");
        for (int x = 0; x < tab.length; x++) {
            if (x < tab.length - 1)
                System.out.print(tab[x] + ", ");
            else
                System.out.print(tab[x] + "]");
        }
        System.out.println("\n");

        zamianaMiejsc(tab, 2, 5);
    }

    public static void zamianaMiejsc(int tab[], int a, int b) {
        if (a < 0 || a >= tab.length) {
            System.out.println("Podana warto?? a wykracza poza tablic?.");
        }
        else if (b < 0 || b >= tab.length) {
            System.out.println("Podana warto?? b wykracza poza tablic?.");
        }
        else {
            int c, d;
            c = tab[a];
            d = tab[b];

            tab[a] = d;
            tab[b] = c;

            System.out.println("Tablica po zmianie: ");
            System.out.print("[");
            for (int y = 0; y < tab.length; y++) {
                if (y < tab.length - 1)
                    System.out.print(tab[y] + ", ");
                else
                    System.out.print(tab[y] + "]");
            }
        }

    }
}
