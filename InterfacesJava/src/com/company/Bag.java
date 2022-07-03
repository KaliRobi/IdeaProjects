package com.company;

import java.util.ArrayList;

public class Bag {
    private ArrayList<Object> Alist;

    public Bag(){
        this.Alist = new ArrayList<Object>();

    }


    public ArrayList<Object> getArrayList() {
        return Alist;
    }

    public void addItem(String name){
        System.out.println(name);
        System.out.println(getArrayList());
        this.Alist.add(name);
    }
    public void showItemList(){
        for(Object item: Alist)
            System.out.println((Alist.indexOf(item) +1) + " - " + item);
    }


}
