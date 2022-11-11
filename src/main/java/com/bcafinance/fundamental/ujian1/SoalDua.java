package com.bcafinance.fundamental.ujian1;
import java.util.Random;
/*
Created By IntelliJ IDEA 2022.2.3 (Ultimate Edition)
@Author Jett a.k.a. Jett Enrico Chandra
CTO
Created on 11/11/2022
@Last Modified 11/11/2022 2:27 PM
Version 1.0
*/

public class SoalDua {
    public static void main(String[] args) {
        String strVokal = "aiueo";
        String strKonso = "bcdfghjklmnpqrstvwxyz";
        String strAlphabet ="abcdefghijklmnopqrstuvwxyz";
        char[] arrVokal = strVokal.toCharArray();
        char[] arrKonso = strKonso.toCharArray();
        char[] arrAlphabet = strAlphabet.toCharArray();
        String strOutput ="";
        Random rand = new Random();
        int penampung = rand.nextInt(2);

        for(int i=0;i<rand.nextInt(12,100);i++){
            if(i<7){
                if(penampung==1){
                    penampung=2;
                    strOutput += arrKonso[rand.nextInt(21)];
//                   System.out.println(arrKonso[rand.nextInt(21)]);
                }else{
                    penampung=1;
                    strOutput += arrVokal[rand.nextInt(5)];
//                   System.out.println(arrVokal[rand.nextInt(5)]);
                }
            }else{
                strOutput += arrAlphabet[rand.nextInt(26)];
            }

        }
        System.out.println(strOutput.substring(0,1).toUpperCase()+strOutput.substring(1));
    }
}
