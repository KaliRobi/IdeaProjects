package com.company;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); //arraylisis class, thats why brackets are here, so this is a constructor

    public void addGroceryItems(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    private void modifyGroceryItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery item " + (pos + 1) + " hs been modified");
    }

    private void removeGroceryItem(int pos){
        String theItem = (groceryList.get(pos));
        groceryList.remove(pos);
    }
    private int findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
           return  groceryList.indexOf(searchItem);

    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
            int position = findItem(newItem);
            if(position >= 0){
                modifyGroceryItem(position, newItem);
            }
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }


}
