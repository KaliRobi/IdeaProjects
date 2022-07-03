package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int rem =  goal - (bigCount * 5);
        int srem = smallCount - rem;
        System.out.println(srem);
        System.out.println(rem);
        if(bigCount < 0 || smallCount < 0 || 5 > goal || (bigCount * 5) < goal && smallCount < goal - (bigCount * 5) ){
            return false;
        } else  if  (srem > 0 || goal % 5 == 0){
            return true;
        }
        else {
        return false;}
        }

}

// goal smaller than the bigpackage FALSE
// goal larger than the big count and the reminder smaller than the smallcount FALSE
//
