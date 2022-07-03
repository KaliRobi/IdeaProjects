package com.company;

import java.util.ArrayList;
//SCANNER
public class Customer {

    private String name;
    private ArrayList<Double> customerTransactions;


    public Customer(String name, ArrayList<Double> customerTransactions) {
        this.name = name;
        this.customerTransactions = customerTransactions;
    }

    public ArrayList<Double> getTransactions(){
        return customerTransactions;
    }

    public void addToTransactions(ArrayList<Double> listOfCustomerTransaction, double newTransaction){
        listOfCustomerTransaction.add(newTransaction);
        System.out.println("new transaction" + newTransaction + "is done");
    }


}
