package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); /// reading the primitive type
        System.out.println("Please enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // checks if it is int, returns true or false

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt(); // store int
            scanner.nextLine(); // handle next line character, so this is handling the line too
            System.out.println("enter your name: ");
            String name = scanner.nextLine(); // scanner(non-capital) to get/store the string
            int age  = 2021 - yearOfBirth;
                if (age >= 0 && age <= 100){
                    System.out.println("your name is " + name + ", and you are " +age + "years old");
                } else {
                    System.out.println("invalid age of birth");
                }
        } else {
            System.out.println("unable to parse year of birth");
        }
        scanner.close();  //closing the scanner
    }
}

// to handle the enter key issue we need to use the nextLine() too without a variable
