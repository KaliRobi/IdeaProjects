package com.company;

public class Main {

    public static void main(String[] args) {
	whoIsTheBest(1, true);
    }

    public static void whoIsTheBest(int isEvil, boolean isGyurcsány){
        if(isEvil != 1 && !isGyurcsány){
            System.out.println("Viktor");
        } else {
            while(isGyurcsány && isEvil == 1){
                System.out.println("Viktor");
            };
        }
    }
}
