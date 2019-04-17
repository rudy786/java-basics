package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner InputUser = new Scanner(System.in);

        int nilaibenar = 8;
        int nilaitebakan;
        boolean statustebakan;

        System.out.print("masukan nilai tebakan anda :");
        nilaitebakan = InputUser.nextInt();
        System.out.println("nilai tebakan anda adalah :"+ nilaitebakan);

        //operasi logika

        statustebakan = (nilaitebakan == nilaibenar);
        System.out.println("nilai anda :"+ statustebakan);

        // operasi aljabar logika
        System.out.print("masukan nilai antara 5 sampai 10 :");
        nilaitebakan = InputUser.nextInt();
        statustebakan = (nilaitebakan >5)  && (nilaitebakan < 10);
        System.out.print( "nilai anda adalah :"+ statustebakan);
    }
}
