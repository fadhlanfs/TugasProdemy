package com.soal4;

public class Main {
    public static void main(String[] args) {

        int baris = 9; // Jumlah baris dan kolom dalam pola
        int indeks = baris / 2; // Indeks tengah
        int bilangan = 1; // Bilangan pertama
        int bilanganSebelumnya = 1; // Bilangan kedua
        int fibonacciIndex = 2; // Indeks untuk melacak bilangan Fibonacci
        int fibonacciTarget = 34; // Indeks terakhir yang diinginkan

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris; j++) {
                if (i == j || i == baris - j - 1) {
                    System.out.print(bilangan);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if (fibonacciIndex <= fibonacciTarget) {
                // Menghitung bilangan Fibonacci
                int temp = bilangan;
                bilangan += bilanganSebelumnya;
                bilanganSebelumnya = temp;
                fibonacciIndex++;
            } else {
                // Jika sudah mencapai indeks terakhir, tetap gunakan bilangan terakhir (21)
                bilangan = fibonacciTarget;
            }
        }


    }
}
