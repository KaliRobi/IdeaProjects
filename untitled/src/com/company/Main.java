package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(20,40));
    }
    public static int  getGreatestCommonDivisor(int one, int two){

        if (one < 10 || two < 10){
            return -1;
        } else {
            int a = 0;
            if( one >= two){
                a = two;
            } else {
                a = one;
            }
            while(true){
                if(one % a == 0){
                    if(two % a == 0) {
                        return a;
                    } else {
                        a = a-1;
                    }
                }else {
                    a = a-1;
                }
            }

        }
    }
    public  static String 
}
