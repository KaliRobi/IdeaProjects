package com.company;

public class Main {

    public static void main(String[] args) {
        if(isPalindrome(1234321)){
            System.out.println("true");
        } else {
            System.out.println("false");
        };
    }
    public static boolean isPalindrome(int number) {
        int origin  = number;
        int reverse = 0;
        while(number != 0) {
            int lastDigit = number % 10; 
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if(reverse == origin){
            return true;
        }
        return false;

    }
}
