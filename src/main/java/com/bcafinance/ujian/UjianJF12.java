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
import java.util.Scanner;

public class UjianJF12 {
    public static void main(String[] args) {
        int input = 0;
        System.out.print("Jumlah data format email yang ingin di generate  : ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        for(int i =1; i<=input; i++){
            generateRandomEmail();
        }
    }

    public static void generateRandomEmail(){
        Random random = new Random();
        String[] Kodeprovider = { "gmail", "yahoo" , "ymail", "rocketmail"};
        String[] domain = { "com", "id", "co.id", "us", "jp" };

        int intRandomNumber = 0;
        int intRandomDomain = 0;
        int panjangEmail = random.nextInt(10, 16);
        int panjangNumber = random.nextInt(2, 5);
        int panjangAlfabet = panjangEmail - panjangNumber;

        StringBuilder email = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder alfa1 = new StringBuilder();
        StringBuilder alfa2 = new StringBuilder();

        for (int i = 0; i < panjangNumber; i++) {
            int rand = random.nextInt(0, 10);
            number.append(rand);
        }

        for (int i = 0; i < panjangAlfabet; i++) {
            int rand = random.nextInt(97, 123);
            if (i < panjangAlfabet / 2) {
                alfa1.append((char) rand);
            } else {
                alfa2.append((char) rand);
            }
        }

        int intPrefix = random.nextInt(0, 3);
        String strAppend = "";
        intRandomNumber = random.nextInt(1,4);
        intRandomDomain = random.nextInt(1,5);
        if (intPrefix == 0) {
            strAppend += email.append(number).append(alfa1).append(alfa2).append("@").append(Kodeprovider[intRandomNumber]).append(".").append(domain[intRandomDomain]);
        } else if (intPrefix == 1) {
            strAppend += email.append(alfa1).append(number).append(alfa2).append("@").append(Kodeprovider[intRandomNumber]).append(".").append(domain[intRandomDomain]);
        } else if (intPrefix == 2) {
            strAppend += email.append(alfa1).append(alfa2).append(number).append("@").append(Kodeprovider[intRandomNumber]).append(".").append(domain[intRandomDomain]);
        }
        System.out.println(strAppend);
    }
}

