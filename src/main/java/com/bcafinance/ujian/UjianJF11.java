package com.bcafinance.ujian;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 21/08/2023 13:20
@Last Modified 21/08/2023 13:20
Version 1.0
*/

import java.util.Random;
import java.util.Scanner;
public class UjianJF11 {
    public static void main(String[] args) {
        int input = 0;
        System.out.print("Jumlah data format no handphone yang ingin di generate  : ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        for(int i =1; i<=input; i++){
            generateRandomMobileNumber();
        }

    }

    public static void generateRandomMobileNumber(){
        Random random = new Random();

        // Generate a random number of digits between 10 and 14
        int numDigits = random.nextInt(10, 14); // Range: 10 to 14

        int intPrefix = 0;

        Integer digitPertama62 = 62;
        Integer digitPertama0 = 0;
        Integer digitKedua = 8;
        Integer[] kodeProvider = {12, 13, 57, 56, 52};

        int intRandomNumber = 0;
        String strAppend = "";

        StringBuilder sBuild = new StringBuilder();

        intPrefix = random.nextInt(0, 3);
        strAppend = "";
        if (intPrefix==1){
            //format pertama 62
            intRandomNumber = random.nextInt(1,5);
            strAppend += String.valueOf(digitPertama62) + String.valueOf(digitKedua) + String.valueOf(kodeProvider[intRandomNumber]) +"-"+ String.valueOf(generateTigaDigit()) +"-"+ String.valueOf(generateDigitTerakhir());

        } else {
            //format pertama 0
            intRandomNumber = random.nextInt(1,3);
            strAppend += String.valueOf(digitPertama0) + String.valueOf(digitKedua) + String.valueOf(kodeProvider[intRandomNumber]) +"-"+ String.valueOf(generateTigaDigit()) +"-"+ String.valueOf(generateDigitTerakhir());
        }
        System.out.println(strAppend);
    }

    public static String generateTigaDigit(){
        Random random = new Random();
        int randomNumber = random.nextInt(100, 1000);
        String strAppend = "";
        strAppend += randomNumber;
        return strAppend;

    }

    public static String generateDigitTerakhir(){
        Random random = new Random();
        String strAppend = "";
        int randomNumber = 0;
        for(int i=1; i<=4; i++){
            randomNumber = random.nextInt(0, 10);
            strAppend += randomNumber;
        }
        return strAppend;
    }
}



