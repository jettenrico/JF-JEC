package com.bcafinance.fundamental.day4;
/*
Created By IntelliJ IDEA 2022.2.3 (Ultimate Edition)
@Author Jett a.k.a. Jett Enrico Chandra
CTO
Created on 11/10/2022
@Last Modified 11/10/2022 1:56 PM
Version 1.0
*/

public class Soal1 {
    public static void main(String[] args) {
        int[] arrInt = {3,8,5,2,1,9,10};
        int intB = 11;
        Boolean isFound = true;

        for(int i=0;i<arrInt.length;i++){
            if(intB==arrInt[i]){
                System.out.println("Angka "+intB+" Sudah ditemukan pada index ke "+i);
                isFound = false;
            }
        }
        if(isFound){
            System.out.println("Angka "+intB+" yang anda cari tidak ditemukan!");
        }
    }
}
