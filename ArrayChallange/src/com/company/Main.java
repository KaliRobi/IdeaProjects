package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        sortIntegers(getIntegers());
        printArray();
}
        public static int[] getIntegers() { // beadja a szamokat
            Scanner sca = new Scanner(System.in);
            System.out.println("How long the is array?");
            String length = sca.nextLine();
            System.out.println("enter the sequence of numbers");
            int[] myArray = new int[Integer.parseInt(length)];
            for(int i = 0; i < Integer.parseInt(length); i++) {
                String num = sca.nextLine();
                myArray[i] = Integer.valueOf(num);
            }
            return myArray;
        }
        public static void printArray() {
            for (int i = 0; i < getIntegers().length; i++ ) {
                System.out.println(getIntegers()[i]);
            }
        }
        public static int[] sortIntegers(int[] myArray) {
//            for (int i = 0; i < myArray.length; i++) {
//                for (int j = i + 1; j < myArray.length; j++) {
//                    if (myArray[j] > myArray[i]) {
//                        int temp = myArray[i]; //megorizuk az eredeti szamot
//                        myArray[i] = myArray[j]; // elore rakjuk a nagyobb szamot
//                        myArray[j] = temp;  // hatra rakjuk a kisebbet
//                    }
//                }
//            }
            for(int i = 0; i <myArray.length-1; i++){
                if (myArray[i+1] > myArray[i]) {
                    int temp = myArray[i]; //megorizuk az eredeti szamot
                    myArray[i] = myArray[i+1]; // elore rakjuk a nagyobb szamot
                    myArray[i+1] = temp;  // hatra rakjuk a kisebbet
                }
            }
            System.out.println("The numbers in descending order: ");
            for (int k = 0; k < myArray.length; k++) {
                System.out.println(myArray[k]);
            }
            return myArray;
        }
    }

