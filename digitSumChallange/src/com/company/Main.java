package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
//    public static int sumDigits(int number){
//        int sumOfDigits = 0;
//        if(number <= 9){
//            return -1;
//        } else{
//            String strNum = (String.format("%d",number));
//
//            for(int i = 0; i < strNum.length(); i++){
//                // get the digit
//                int dig = Character.getNumericValue(strNum.charAt(i));
//
//                sumOfDigits += dig;
//            }
//
//
//            return sumOfDigits;
//        }
//    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number <= 9){
            return -1;
        }
        while(number > 0){
                int dig = number % 10;
                sum += dig;
            System.out.println(number);
                number /= 10;
            System.out.println(number);

            }


            return sum;

    }
}
