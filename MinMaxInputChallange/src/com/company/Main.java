package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;
        while(true){
            System.out.println("Enter the number ");
            boolean isInt = scanner.hasNextInt();
            int num = scanner.nextInt();

            if(isInt){
                if(first){
                    first = false;
                    min = num;
                    max = num;
                }
                if(max < num ){
                    max = num;

                }
                if (min > num) {
                min = num;

                }

            }
            else {
                break;
            }
            System.out.println("maximum " + max + " and the min is " + min);
            scanner.nextLine();
        }
        scanner.close();
    }
}
