package com.company;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	MobilPhone phone = new MobilPhone();
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.showContactList();
                    break;
                case 2:
                    phone.addContactToContactList();
                    break;
                case 3:
                    phone.modifyItemsInTheContactList();
                    break;
                case 4:
                    phone.removeContact();
                case 5:
                    phone.showAContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Show Menu.");
        System.out.println("\t 1 - Show contact list.");
        System.out.println("\t 2 - Add new contact to the list");
        System.out.println("\t 3 - Change existing contact");
        System.out.println("\t 4 - Remove contact.");
        System.out.println("\t 5 - Show a contact");
        System.out.println("\t 6 - To quit the application.");
    }










    }


