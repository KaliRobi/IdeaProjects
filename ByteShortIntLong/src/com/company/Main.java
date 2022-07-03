package com.company;

public class Main {

    public static void main(String[] args) {
	    byte myTotal = 5;
        byte mzMewByte = (byte)(myTotal / 2);

        byte myBite = 2;
        short myShort = 1000;
        int myInt = 2000;
        long myLong = 50000L + 10L * (myBite + myShort + myInt);
        System.out.println(myLong);

        int myIn = 5 / 3;
        float myf  = 5f / 3f;
        double myDu  = 5d / 3d;
        System.out.println("MyInValue = " + myIn );
        System.out.println("MyFValue = " + myf );
        System.out.println("MyDuValue = " + myDu );

        double Pounds = 200;
        double Kilos = Pounds * 0.45359237;
        System.out.println(Kilos);

    


    }
}
