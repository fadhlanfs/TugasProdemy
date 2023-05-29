package com.tugas2padding;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- TUGAS PADDING ---");

        Scanner scan = new Scanner(System.in);
        System.out.printf("Masukan teks: ");
        String inputTeks = scan.nextLine();
        System.out.printf("Masukan panjang: ");
        int inputPanjang = scan.nextInt();
        System.out.printf("\n");

//        String kata = "abc";
//        int panjang = 5;

        char padding = ' ';

        System.out.println("Sebelum Padding : ");
        System.out.println(inputTeks);

        String kataPadding = LeftPadding(inputTeks, inputPanjang, padding);
        System.out.println("Left Padding : ");
        System.out.println(kataPadding);

        kataPadding =  RightPadding(inputTeks, inputPanjang, padding);
        System.out.println("Right Padding : ");
        System.out.println(kataPadding);


    }

    public static String LeftPadding (String kataPadding, int panjangTotal, char charPadding){
        StringBuilder sb = new StringBuilder();

        int panjangPadding = panjangTotal - kataPadding.length();

        for (int i = 0; i < panjangPadding; i++){
            sb.append(charPadding);
        }
        sb.append(kataPadding);
        return sb.toString();
    }

    public static String RightPadding (String kataPadding2, int panjangTotal2, char charPadding2){
        StringBuilder sb2 = new StringBuilder(kataPadding2);

        int panjangPadding = panjangTotal2 - kataPadding2.length();

        for (int i = 0; i < panjangPadding; i++){
            sb2.append(charPadding2);
        }
        return sb2.toString();
    }
}