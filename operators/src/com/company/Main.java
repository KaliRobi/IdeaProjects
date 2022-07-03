package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 2 + 5;
        System.out.println(result);

        result++;
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result += 100;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("It is not an all lien!");

        }

        int topScore = 80;
        if (topScore != 100){
            System.out.println("you got the score");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90)|| (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newVal = 50;
        if(newVal == 50) {
            System.out.println("this is an error");
        }
        boolean isCare = false;
        if (!isCare){
            System.out.println("its aint a car");
        }
        boolean isCar = true;
        boolean wasCar = isCar ? true : false; // is it, otherwise false
        // ? is the first ture : --> this is an else
        // a wasCare ha aisCare ture akko true ha nem akkor false
        if (wasCar) // ha a wasCare igaz akkor nyomtass
            System.out.println("was is true");

        double myDob = 20.00;
        double secDob = 80.00;
        double resDob = (myDob + secDob) * 100.00;
        System.out.println(resDob);
        double remDob = resDob % 40.00;
        System.out.println(remDob);

        boolean boVal = true ? remDob==0 : false; // elore a true valut
        System.out.println(boVal);
        if(!boVal){
            System.out.println("Got some reminder");
        }



    }
}
