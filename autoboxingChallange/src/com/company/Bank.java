package com.company;

import java.util.ArrayList;
import java.util.Scanner;

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions 
public class Bank {
    private ArrayList<Branch> listOfBranches =   new ArrayList<Branch>();
    Scanner sca = new Scanner(System.in);


    public Bank(ArrayList<Branch> lostOfBranches) {
        this.listOfBranches = lostOfBranches;

    }

    private Branch returnBranch(String name){
        Branch lookedUpBranch = listOfBranches.get(listOfBranches.lastIndexOf(name));
        return lookedUpBranch;
    }
    private Branch returnBranch(Branch name){
        Branch lookedUpBranch = listOfBranches.get(listOfBranches.lastIndexOf(name));
        return lookedUpBranch;
    }

    public void addCustomerToTheBranch(){
        System.out.println("please name the new customer's name: ");
        String name = sca.nextLine();
        System.out.println("Please enter the associated branch: ");
        String nameOfBranch = sca.nextLine();
        Branch currentBranch = returnBranch(nameOfBranch);
        currentBranch.createNewCustomer(name);
    }
    public void updateCustomer(){
        System.out.println("Which branch: ");
        String branch = sca.next();
        System.out.println("Name of the customer: ");
        String name = sca.nextLine();
        Branch currentBranch = returnBranch(branch);
        double amount = 0.1;
        currentBranch.updateCustomer(name, amount);
    }
    public void createNewBranch(){
        System.out.println("Which branch: ");
        String branch = sca.next();
        ArrayList<Customer> list = new ArrayList<Customer>();
        Branch newBranch = new Branch(branch, list);
        listOfBranches.add(newBranch);
    }
    public void checkBranchesAndCustomers(){
        for(int i = 0; i < listOfBranches.size(); i++){
            System.out.println("this is a branch :" + listOfBranches.get(i));
            for(int k = 0; k < returnBranch(listOfBranches.get(i)).getCustomerList().size(); k++){
                System.out.println(listOfBranches.get(i).getCustomer(k) + " is member of this branch ");

            }
        }
    }

}
