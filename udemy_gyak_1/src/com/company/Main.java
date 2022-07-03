package com.company;

public class Main {

    int year =  1500;

    public static boolean isLeapYear(int year){
        if(year <= 1 || year >= 9999){
            if(year % 100 == 0){
                if(year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
