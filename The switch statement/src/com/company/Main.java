package com.company;

public class Main {

    public static void main(String[] args) {
	int num = 1;
    switch (num){
        case 1:
            System.out.println("value was 1");
            break;
        case 2:
            System.out.println("value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("value was " + num);
            break;
        default:
            System.out.printf("was not 1 nor 2");
            break;

    }
    char challengeChar = 'a';
    switch (challengeChar) {
        case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("this was " + challengeChar);
            break;
        default:
            System.out.println("Not found");
            break;
    }
    }

}
