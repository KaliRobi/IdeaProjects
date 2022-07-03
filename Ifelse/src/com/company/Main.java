package com.company;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 100;
//        int levelCompleted = 5;
//        int bonus = 100;

//        if(score >= 5000) {
//            System.out.println("your score bigger 5000");
//        } else if (score < 1000) {
//            System.out.println("score was less 100");
//        }
//        else {
//            System.out.println("somewhere between 1000 and 5000");
//        }
         calculateScore(true, 800, 5, 200);

         calculateScore(true, 10000, 8, 200);
//         if (gameOver){
//             int finalScore = score + (levelCompleted * bonus);
//             System.out.println("your final score was " + finalScore);
//         }
//         int secScore = 10000;
//         int levelComp = 8;
//         int bonuz = 200;

//         if(secScore > 0) {
//             int endScore = score + (levelComp * bonuz);
//             System.out.println("pontszamod: " + endScore );
//       }
       }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
       if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
            return finalScore;
        } else {
           return -1;
       }
        // return -1
    }
}
