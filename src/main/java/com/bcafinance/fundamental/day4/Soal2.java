package com.bcafinance.fundamental.day4;
/*
Created By IntelliJ IDEA 2022.2.3 (Ultimate Edition)
@Author Jett a.k.a. Jett Enrico Chandra
CTO
Created on 11/10/2022
@Last Modified 11/10/2022 2:36 PM
Version 1.0
*/

public class Soal2 {
    public static void main(String[] args) {
        int keyword = 77;
        int[] arrInt = {66,77,80,84,88,99,100};
        int low = 0;
        int high = arrInt.length - 1;
        int med = 0;
        boolean status = false;
        while (low<=high){
            med=(low+high)/2;

            if(keyword==arrInt[med]){
                System.out.println(keyword+" Founded in Position "+(med+1)+" and Index "+med);
                status=true;
                break;
            }else {
                if (keyword>arrInt[med]){
                    low=med+1;
                }else{
                    high=med-1;
                }
            }
        }

        if(!status){
            System.out.println(keyword+" Not Found!!");
        }
    }
}
