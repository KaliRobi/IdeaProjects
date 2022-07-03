package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    private String name;
    private String number;
    Scanner sca = new Scanner(System.in);
    String[] contact = new String[] {name, number};


    private String setNumber(String number) {
        this.number = number;
        return this.number;
    }

    private String setName(String name) {
        this.name = name;
        return this.name;
    }

    public void setContact(String[] contact) {
        this.contact[0] = setName(name);
        this.contact[1] = setNumber(number);
    }

    private String getName() {
        return name;
    }


    private String getNumber() {
        return number;
    }


    public String showName(){
        return getName();
    }
    public String showNumber(){
        return getNumber();
    }

    public String[] createContact(){
        String[] contact = new String[2];
        System.out.println("Enter the name of the new contact: ");
        contact[0] =  sca.nextLine();
        System.out.println("Add a number: (yes: 1/no: 2)");
        contact[1] = "Null";
        int yOrN = sca.nextInt();
        while(yOrN > 2 || yOrN < 1 ) {
            System.out.println("Invalid option, try again: ");
            yOrN = sca.nextInt();
        }
        switch (yOrN){
            case 1:
                System.out.println("Please enter the number: ");
                sca.nextLine();
                contact[1]  = sca.nextLine();
                return  contact;
            case 2:
                System.out.println("Thank you! Back to the Main Menu.");
                return  contact;

        }
        return  contact;
    }
    private int getContact(ArrayList<String[]> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i)[0].equals(name)) {
                return -1;
            }return list.indexOf(list.get(i));

        } return -1;
    }
    public void addName(String[] arr){
        System.out.println("Please add the new name of the contact: ");
        String oldName = arr[0];
        arr[0]= sca.nextLine();
        System.out.println("The old contact name "+ oldName + " has been changed for " + arr[0]);
    }
    public void addNumber(String[] arr){
        System.out.println("Please add the new number of " +arr[0] + ":  ");
        String oldPhone = arr[1];
        arr[1] = sca.nextLine();

        System.out.println("The number of " + arr[0] + " is changed for " + arr[1]);

    }
    private boolean noSuchContact(int num) {
        switch (num){
            case -1:
            System.out.println("No such contact in the list");
            return true;

        } return false;
    }
    public void modifyContact(ArrayList<String[]> list){
       // System.out.println("contact name: " + list.get(0)[0] + " Contact phone number: " + list.get(0)[1]);
        System.out.println("Which contact would you like to change? \n ");
        sca.nextLine();
        String namedContact = sca.nextLine();
        int isThereContact = getContact(list, namedContact);
        if(!noSuchContact(isThereContact)){
        String[] lookedContact = list.get(getContact(list, namedContact));
        System.out.println("The selected contact is " + lookedContact[0] + " with the phone number of " + lookedContact[1] );

        System.out.println("Would you like to change the name(0) the number(1) or both(2)? :");
        int changeKey = sca.nextInt();
        sca.nextLine();
            while(changeKey > 2 || changeKey < 0){
                System.out.println("Invalid option, please try again");
                changeKey = sca.nextInt();
                sca.nextLine();
            }
            switch (changeKey){
            case 0:
                addName(lookedContact);
                break;
            case 1:
                addNumber(lookedContact);
                break;
            case 2:
                addName(lookedContact);
                addNumber(lookedContact);
                break;
            default:
                System.out.println("Invalid option, please try again");
        }
        }
        else{
            returnToTheMenu(); // this could be a switch
        }
    }
    public void returnToTheMenu(){
        System.out.println("return to the Main Menu");
    }
    public boolean isThereAnIndex(ArrayList<String[]> list, String contact){
        int indexNumber = getContact(list, contact);
        if(indexNumber < 0){
            return false;
        } return true;
    }

    public void removeContact(ArrayList<String[]> list){
        System.out.println("Which contact should be removed? ");
        String contactToRemove = sca.nextLine();
        if(!isThereAnIndex(list, contactToRemove)){
            noSuchContact(-1);
        } else {
            list.remove(getContact(list, contactToRemove));
            System.out.println(contactToRemove + " has been removed from the contact list");
        }
    }

    public void showContact(ArrayList<String[]> list){
        System.out.println("Which contact would you like to see? ");
        String neededContact = sca.nextLine();
        if (!isThereAnIndex(list, neededContact)){
            noSuchContact(-1);
        } else {
            int theIndex = getContact(list, neededContact);
            noSuchContact(theIndex);
            String[] arr = list.get(theIndex);
            String num = arr[1];
            System.out.println("Contact: " + neededContact + ", phone number: " + num);
        }
    }





}
