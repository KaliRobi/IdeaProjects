package com.company;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String mySting = "This is a string";
        mySting = mySting + ", \u00A9 and this is more";
        System.out.println("My string is equal to " + mySting);

        String lastString  = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);

    }
}
