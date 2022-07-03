package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        for (int i = 0; i<5; i++)  {
//            System.out.println("Loop "+ i + " hello!");
//        }
//        for (int i = 2; i<9; i++){
//            System.out.println("The result is: " + String.format("%.1f",calculateInterest(10000.0, i)));
//        }
//        for (int i = 8; i>1; i--){
//            System.out.println("The result is: " + String.format("%.1f",calculateInterest(10000.0, i)));
//        }
        int t = 0;
        for (int i = 50; i > 0; i--){

            if(isPrime(i)){
                System.out.println(i);
                t++;
                if (t == 3){
                    break;
                }
            }

        }

    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i =2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount, double interest){
        return (amount * (interest / 100));
    }
}
