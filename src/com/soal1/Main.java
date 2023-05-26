package com.soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Soal Nomor 1A");
        Scanner scan = new Scanner(System.in);
//        System.out.print("Masukan jumlah n: ");
//        int n = scan.nextInt();

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n Soal Nomor 1B");
        int p = 9; // Jumlah baris dan kolom dalam pola
        int l = p / 9; // Indeks tengah

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                if (i == j || i == p - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        int p2 = 5; // Jumlah baris dan kolom dalam pola
        int l2 = p2 / 5; // Indeks tengah

        for (int i = 0; i < p2; i++) {
            for (int j = 0; j < p2; j++) {
                if (i == j || i == p2 - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("\n Soal Nomor 1C");
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n Soal Nomor 1D");

        int p3 = 9; // Jumlah baris dan kolom dalam pola
        int l3 = p3 / 2; // Indeks tengah
        int bilangan = 1; // Bilangan ganjil awal

        for (int i = 0; i < p3; i++) {
            for (int j = 0; j < p3; j++) {
                if (i == j || i == p3 - j - 1) {
                    System.out.print(bilangan);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            bilangan += 2; // Melakukan penambahan bilangan ganjil setiap ganti baris
        }

    }
}
