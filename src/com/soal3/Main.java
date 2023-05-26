package com.soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan jumlah suku Tribonacci: ");
//        int n = scanner.nextInt();
//
//        int[] tribonacci = new int[n];

        //jika menggunakan scanner, barisan ini dihapus
        int[] tribonacci = new int[8];


        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 1;

        //jika menggunakan scanner, tribonacci.length diganti n
        for (int i = 3; i < tribonacci.length; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        System.out.println("Deret Tribonacci:");
        for (int i = 0; i < tribonacci.length; i++) {
            System.out.print(tribonacci[i] + " ");
        }
    }
}
