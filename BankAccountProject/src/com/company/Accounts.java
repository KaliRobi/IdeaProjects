package com.company;

public class Accounts {
    private int accountNumber;
    private int balance;
    private String customerName;

// creating a constructor

    public Accounts(){
        System.out.println("empty constructor created");
    }
    public  Accounts(int accountNumber, int balance, String customerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public Accounts(int balance, String customerName) {
        this(9999, 2222, "tom");
       // to default these
    }

    public int getAccountNumber(){
       return this.accountNumber;
    }
    public void setAccountNumber(int num){
        this.accountNumber = num;
    }

    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int num) {
        this.balance = num;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public void depositToAccount(int amount){
        if(amount <= 0){
            System.out.println("invalid  amount");
        } else {
            this.balance += amount;
            System.out.println("Success! New deposit: " + amount + " current balance: " + this.balance );
        }
    }

    public void withdrawFromAccount(int amount){
        if(amount <= 0 ){
            System.out.println("Invalid amount");
        } else if (this.balance < amount){
            System.out.println("Not sufficient fund");
        } else {
            this.balance -= amount;
            System.out.println("Success! " + amount + " is withdrawn your current balance is " + this.balance);
        }
    }
}
