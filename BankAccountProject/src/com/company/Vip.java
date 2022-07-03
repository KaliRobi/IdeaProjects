package com.company;

public class Vip {
    private String name;
    private double creditLimit;
    private String email;

    // worth to think upside down
    public Vip(){
        System.out.println("def constructor");;
    };
    public Vip(String name, String email){
        this("def name", "def email", 9999 );
    }
    public Vip(String name, String email, double creditLimit){
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
