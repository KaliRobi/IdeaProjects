package com.company;

public class Main {


    public static void main(String[] args) {
        int year =  1700;
        boolean ret = isLeapYear(year);
        isItThen(ret, year);
        areEqualByThreeDecimalPlaces(3.125252, 3.125252525);
    }


 //

    public static void isItThen(boolean ret, int year){
        if(ret){
            System.out.println(year + "is a leap year");
        } else{
            System.out.println(year + " is not a leap year");
        }
    }



    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 ==0) {
                if(year % 100 == 0){
                    if(year % 400 == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secNum ){
        if(Math.floor(firstNum * 100) / 100 == Math.floor(secNum * 100) / 100){
            System.out.println(Math.pow(firstNum, 3));
            return true;
        } System.out.println(Math.pow(firstNum, 3));
        return false;
    }

}


