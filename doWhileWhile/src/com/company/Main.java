package com.company;

public class Main {

    public static void main(String[] args) {
//	int count =1;
//    while(count != 5){
//        System.out.println("count it "+ count);
//        count++;
//    }
//    count =1;
//    while(true){
//        if(count==5){
//            break;
//        }
//        System.out.println("count it "+ count);
//        count++;
//    }
//    count = 6;
//    do {
//        System.out.println("count value was " + count);
//        count++;
//
//        if(count>100){
//            break;
//        }
//    } while(count != 6);
        int number =4;
        int count = 0;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            } else {
                count++;
                if(count == 5){break;}
            }
            System.out.println("Even number " + number);
        }
        System.out.println(count);
    }
    public static boolean isEvenNumber (int num) {
        if(num%2 == 0){
            return true;
        } return false;
    }
}
