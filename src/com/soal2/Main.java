package com.soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n Soal Nomor 1");
        int fn1 = 1, fn2 = 0, fn = 1;

        for (int i = 0; i < 8; i++) {
            System.out.print(fn + " ");
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;

        }

        System.out.println("\n \n Soal Nomor 2A");

        int x = 1;
        int tambah = 1;

        for (int i = 0; i < 10; i++) {
            if (x != 0) {
                System.out.print(x + " ");
            }

            if (x == 5) {
                tambah = -1; // mengubah penambahan menjadi pengurangan
            }

            x += tambah;
        }


        System.out.println("\n");
        int x2 = 1;
        int tambah2 = 1;

        for (int i = 0; i < 12; i++) {
            if (x2 != 0){
                System.out.print(x2 + " ");
            }

            if (x2 == 6) {
                tambah2 = -1; // mengubah penambahan menjadi pengurangan
            }

            x2 += tambah2;
        }


        System.out.println("\n \n Soal Nomor 2B");

        int n = 10; // Jumlah bilangan dalam deret
        int a = 1; // Suku pertama
        int b = 1; // Suku kedua

        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");

            if (i == 4) {
                // Jika i mencapai 4 (indeks ke-4), lakukan perubahan arah
                int temp = a;
                a = b;
                b = temp;
            } else if (i >= 5) {
                // Setelah perubahan arah, gunakan deret Fibonacci terbalik
                int next = a - b;
                a = b;
                b = next;
            } else {
                // Menghitung suku berikutnya dalam deret Fibonacci
                int next = a + b;
                a = b;
                b = next;
            }
        }

        System.out.println("\n \n Soal Nomor 3");

        int g = 9;
        int before1 = 0, before2 = 1, h = 1;
        int left = 0;
        int right = g - 1;

        for (int i = 0; i < g; i++) {
            for (int j = 0; j < g; j++) {
                if (j == left) {
                    System.out.print(h + " ");
                } else if (j == right && j != (g - 1)) {
                    System.out.print(h + " ");
                } else if (j == right && j == (g - 1)) {
                    System.out.println(h);
                } else if (j != left && j != right) {
                    if (j < g - 1) {
                        System.out.print(" ");
                    } else if (j == g - 1) {
                        System.out.println(" ");
                    }
                }
            }

            if (i < (g - 1) / 2) {
                left++;
                right--;
                h = before1 + before2;
                before1 = before2;
                before2 = h;
            } else if (i <= g - 2) {
                left--;
                right++;
                h = before1;
                before1 = before2 - h;
                before2 -= before1;
            }
        }

    }


    }

