package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample1 implements ISaveable{
    Scanner sca =  new Scanner(System.in);
    private String field1;
    private String field2;

    public void sample(String field1, String field2){
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void addItem(Bag bag) {
        bag.showItemList();
        System.out.println("please chose item from the bag");
        int item = sca.nextInt();
        sca.nextLine();
        if(bag.getArrayList().get(item) != null){
            System.out.println("left(1) or right(2) hand?");
            int hand = sca.nextInt();
            sca.nextLine();
            if(hand > 2 || hand < 0){
                System.out.println("not valid number");
            } else{
                switch (hand) {
                    case 1:
                        field1 = bag.getArrayList().get(item+1).toString();
                        bag.getArrayList().remove(field1);
                        System.out.println("you have a " + field1 + " in your left hand");
                        break;
                    case 2 :
                        field2 = bag.getArrayList().get(item+1).toString();
                        bag.getArrayList().remove(field1);
                        System.out.println("you have a " + field2 + " in your left hand");
                        break;
                }
            }
        } else {
            System.out.println("no such item ggg");
        }



    }

    @Override
    public void populate(Bag bag) {
            addItem(bag);
        }


    @Override
    public ArrayList returnArr() {
        if(storage.size() > 0){
            System.out.println("the sotcks inclue");
            return storage;
        } else {
            System.out.println("no item available");
        }
        return null;
    }
}
