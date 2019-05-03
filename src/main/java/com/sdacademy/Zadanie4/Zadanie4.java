package com.sdacademy.Zadanie4;

public class Zadanie4 {
    public static void main(String[] args) {

        int[] tab = {5, 15, 8, 9, 7, 5, 12};
        System.out.println("Zwartść tablicy: ");
        System.out.print("[");
        for (int x = 0; x < tab.length; x++) {
            if (x < tab.length - 1)
                System.out.print(tab[x] + ", ");
            else
                System.out.print(tab[x] + "]");
        }
        System.out.println();

        System.out.println("Suma liczb podzielnych przez 5 w tabeli wynosi: " + Suma(tab));
    }

    public static int Suma(int[] nazwaTalicy) {
        int suma = 0;
        for (int x = 0; x < nazwaTalicy.length; x++){
            if(nazwaTalicy[x]%5 == 0)
                suma += nazwaTalicy[x];
        }
        return suma;
    }
}
