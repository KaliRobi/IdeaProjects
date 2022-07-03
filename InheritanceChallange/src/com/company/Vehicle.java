package com.company;

public class Vehicle {  //give the characteristics
    private int steering;
    private int gears;
    private int speed;
    private int consumption;

    public Vehicle(int steering, int gears, int speed, int consumption){  // constructor
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
        this.consumption = consumption;

    }

    public void movement(int speed, int steering){
        System.out.println("moving with " + speed + " to direction " + steering);
    }
    public void operationalCost(int consumption, int speed){
        System.out.println(consumption * speed);
    }
}
