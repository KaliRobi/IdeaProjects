package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private  int teeth;
    private String coat;

    // when we want to default, remove it from parameter and give it a def value
    public Dog(String name,   int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes =  eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

        }
    // OVERWRITES A METHOD WHICH IS IN THE SUPER CLASS
    @Override
    public void eat() {
        System.out.println("dog eat called");
        chew();  // calls the chew method of the dog
        super.eat(); // calls the super method eat
    }

    public void chew(){
        System.out.println("CHEW CALLED");
    }

    public void walk(){
        System.out.println("dog.walk called");
        super.move(5);
    }
    public void run(){
        System.out.println("dog.run started");
        super.move(10);
    }
    private void moveLegs(int speed) {
        System.out.println("dog moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("dog/move() called");
        moveLegs(speed)
        super.move(speed); // we dotn need to call it all the time
    }
}

