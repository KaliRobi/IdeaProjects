package com.company;

public class Main {

    public static void main(String[] args) {

    int feet = 5;
    int inches = 62;

    calcFeetAndInchesToCentimeters(inches);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        else{
            double inCenties = (((double)feet * 12) + inches) * 2.54;
            System.out.println(feet + " Feet and " + inches + " inches are " + inCenties + " cms");
            return inCenties;

        }

    }


    public static double calcFeetAndInchesToCentimeters(int inches){

        if(inches <= 0 ) {
            return -1;
        }
        else{
            int inFeet = inches / 12;
            int leftInch= inches % 12;
            return calcFeetAndInchesToCentimeters(inFeet, leftInch);



        }

    }
}
