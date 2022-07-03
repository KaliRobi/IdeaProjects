package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef
public class Main {

    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("what is the count?");
    int count =  sc.nextInt();
    System.out.println(count);
    int[] newArr = readIntegers(count);
    findMin(newArr);
    }
    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        Scanner sca =  new Scanner(System.in);
        System.out.println("enter the numbers:");
        for(int i = 0; i < arr.length; i++){
            int num = sca.nextInt();
            arr[i] = num;

        }
        return  arr;
    }
    public static void findMin(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("min value " + arr[0]);
        System.out.println("max value: " + arr[arr.length-1]);
    }
}
