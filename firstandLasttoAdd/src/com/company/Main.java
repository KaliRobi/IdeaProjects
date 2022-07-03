package com.company;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(56);
    }
    public static int sumFirstAndLastDigit(int num){
        if(num < 0 ){
            return -1;
        }else {
            int lastDii = num % 10;
            int firstDii = num;
            while(firstDii >= 10){
                firstDii = firstDii/10;
            }
            return lastDii + firstDii;
        }
    }
}
