package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isOdd( int num){
        if(num < 0){
            return false;
        }else{
            if(num % 2 != 0){
                return true;
            } else{
                return false;
            }
        }
    }

    public static int sumOdd(int start, int end){
        if(start <= end && start >=0){
            int sum = 0;
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;

                }
            } return sum;
        } else {
        }
        return -1;

    }


}
