package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilPhone {
    public ArrayList<String[]> contacts = new ArrayList<String[]>();
    public Contacts contact = new Contacts();


    public void addContactToContactList(){
        String[] newContact = contact.createContact();
        contacts.add(newContact);
        System.out.println("Contact " + newContact[0] + " with contact phone number " + newContact[1] + " is added to the contact list");
    }

    public void modifyItemsInTheContactList(){
        contact.modifyContact(contacts);
    }

    public void showContactList(){
        System.out.println(" Full contact list: ");
        if(contacts.size() ==  0){
            System.out.println("No contact yet in the List");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("contact name: " + contacts.get(i)[0] + " Contact phone number: " + contacts.get(i)[1]);
            }
        }
    }

    public void showAContact(){
        contact.showContact(contacts);
    }

    public  void removeContact(){
        contact.removeContact(contacts);
    }




}
