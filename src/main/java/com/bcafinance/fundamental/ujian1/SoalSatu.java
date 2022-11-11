package com.bcafinance.fundamental.ujian1;
import java.util.Scanner;
/*
Created By IntelliJ IDEA 2022.2.3 (Ultimate Edition)
@Author Jett a.k.a. Jett Enrico Chandra
CTO
Created on 11/11/2022
@Last Modified 11/11/2022 1:42 PM
Version 1.0
*/

public class SoalSatu {
    public static void main(String[] args) {
        int intTotal=0;
        boolean isAgain=true;
//        Scanner input = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);

        try{
            while(isAgain){
                System.out.print("Masukkan Angka Sepuasnya: ");
                int intNumber=inputAngka.nextInt();
                intTotal += intNumber;
//                System.out.print("Ingin Masukkan Angka Lagi?(Y/N) : ");
//                String charLagi= input.nextLine();
//
//                if(charLagi.contains("y") || charLagi.contains("Y")){
//                    isAgain=true;
//                }
//                else if (charLagi.contains("n") || charLagi.contains("N")) {
//                    isAgain=false;
//                    System.out.println("Jumlah: "+intTotal);
//                }else {
//                    System.out.println("Input Error!!");
//                    System.out.println("Jumlah: "+intTotal);
//                    break;
//                }
            }
        }catch (Exception e){
            System.out.println("Jumlah: "+intTotal);
        }
    }
}
