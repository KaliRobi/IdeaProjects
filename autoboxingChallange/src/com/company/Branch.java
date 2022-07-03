package com.company;

import java.util.ArrayList;
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
public class Branch {
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private String name;

    public Branch(String name, ArrayList<Customer> customerList) {
        this.customerList = customerList;
        this.name = name;
    }

    public Customer createNewCustomer(String name, double amount){
        if(amount > 0){
        ArrayList<Double> customerTransactions = new ArrayList<Double>();
        Customer customer = new Customer(name,  customerTransactions);
        customer.addToTransactions(customerTransactions, amount);
        return customer;}
        else {
            System.out.println("invalid starting amount");
            return null;
        }
    }
    public Customer createNewCustomer(String name){
        ArrayList<Double> customerTransactions = new ArrayList<Double>();
        Customer customer = new Customer(name,  customerTransactions);
        double amount = 0.0;
        customer.addToTransactions(customerTransactions, amount);
        return customer;
    }


    public void updateCustomer(String name, double amount){
        Customer customer = customerList.get(customerList.indexOf(name));
        customer.addToTransactions(customer.getTransactions(), amount);
    }

    public Customer getCustomer(String name){
        return  customerList.get(customerList.indexOf(name));
    }
    public Customer getCustomer(int index){
        return  customerList.get(index);
    }

    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }
}
