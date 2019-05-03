package com.sdacademy.Zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int zakresTablicy, losowe, dodatnie = 0, ujemne = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę elemntów w tablicy: ");
        zakresTablicy = scanner.nextInt();

        int[] tablica = new int[zakresTablicy];
        for(int i = 0; i < tablica.length; i++){
            Random random = new Random();
            losowe = random.nextInt();
            tablica[i]= losowe;

            if(losowe > 0)
                dodatnie += 1;
            else
                ujemne += 1;

        }
        System.out.println("Ilość wylosowanych liczb dodatnich: " + dodatnie);
        System.out.println("Ilość wylosowanych liczb dodatnich: " + ujemne);

    }
}
