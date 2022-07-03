package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
    int score  = 800;
    int levelCompleted = 5;
    int bonus  = 100;

    calculateScore(true, 800,levelCompleted, bonus);

    score = 1000;
    levelCompleted = 8;
    bonus = 200;


    int position = calculateHighScorePosition(400);
    displayHighScorePosition("maike", position);

    calculateScore(gameOver, score, levelCompleted, bonus);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    // void does not return anything
       if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            System.out.println("your final score was " + finalScore);
            // return mindig vissza kell valamit adnia
            return finalScore;
        }
       return -1;

    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + "on the highscore table");

    }
    public static int calculateHighScorePosition(int playerCore){
        if(playerCore > 1000){
            return 1;
        } else if(playerCore > 500){
            return 2;
        } else if (playerCore > 100){
            return 3;
        }
        return 4;

    }



}
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int remainings = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " megaBytes " MB and " + remainings + " KB" );

    }

}
