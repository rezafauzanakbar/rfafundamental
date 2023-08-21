package com.bcafinance.Pratikum;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 16/08/2023 11:11
@Last Modified 16/08/2023 11:11
Version 1.0
*/

import java.util.Scanner;

public class TugasDay3 {
    public static void main(String[] args) {
//        MENEMUKAN POLA
//        String strA = "Speed 90 K/M"; //649
//        String strB = "50 Korban 3 Begal"; //1080
//        String strC = "18 - Peserta Traning"; // berapa?
//
//        char [] chArr = strA.toCharArray();
//        char [] chBrr = strB.toCharArray();
//        char [] chCrr = strC.toCharArray();
//
//        int ascii;
//        int jumlah = 0;
//        for(int i=0; i<chArr.length; i++){
//            ascii=chArr[i];
//            // System.out.println(ascii);
//            if ((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)){
//                jumlah += ascii;
//                System.out.println(jumlah);
//            }
//
//        }

//        PROGRAM
        String input = "";
        int convert;
        int hasil = 0;
        System.out.println("Masukkan Kata : ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        char [] arrInput = input.toCharArray();
        for (int x=0; x<arrInput.length; x++){
            convert=arrInput[x];
            if ((convert>=65&&convert<=90)||(convert>=97&&convert<=122)){
                hasil += convert;
            }
        }
        System.out.println("Hasilnya adalah = " + hasil);

//        String ulang = "N";
//        do {
//            System.out.println("Mau Coba Lagi? (Y/N)");
//            ulang = scanner.next();
//        } while (ulang.equals("Y"));
    }


}

