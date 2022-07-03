package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isLeapYear(int year){
        if(year <= 1 || year >= 9999){
            return false;
        } else {
            if(year % 4 == 0 && year % 100 !=0){
                return true;
            } else if (year % 4 == 00 && year % 400 ==0){
                return true;
            }
        } return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(month > 12 || month < 1 || year > 9999 || year < 1){
            return -1;
        } else if (month == 2){
                if (isLeapYear(year)) {
                             return 29;
                } else {
                    return 28;
                }
        }else {
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                default:
                    return 30;
            }
        }
    }
}
