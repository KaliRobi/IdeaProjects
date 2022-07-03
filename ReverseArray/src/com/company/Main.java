package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

//-Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name eReverseArrayChallengef
public class Main {

    public static void main(String[] args) {
    int[] newArr = new int[] {0,1,2,3,4,5,6,7,8,9,10};
    System.out.println(Arrays.toString(newArr));
    reverse(newArr);
    }
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp= arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
