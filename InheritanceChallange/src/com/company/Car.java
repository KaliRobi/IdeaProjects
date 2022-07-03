package com.company;

public class Car extends Vehicle {
    private int fuel; // here we need only the extra variables
    private int steering;
    private int wheels;
    private int doors;
    // the subclass calls the constructor of the extended class
    // we can remove parameters and set the value in super like here speed
    public Car(int steering, int gears,  int wheels, int doors, int fuel, int consumption){
        super(steering, gears, 1, consumption); // call the constructor from the extended class
        this.steering = steering;  // initialise the extended ones
        this.wheels = wheels;
        this.doors = doors;
        this.fuel = fuel;
    }

    public int getWheels() {
        return wheels;
    }

    // if we overwrite good practice to set private method which will
    // overwrite the parent clases method in a second on
    private void drive(){
        System.out.println(speed +" speed and direction  " + steering);
    }

    @Override
    public void movement(int speed, int steering) {
        drive();
        super.eat(); // not necessary
    }

    @Override
    public void operationalCost(int consumption, int speed) {
        super.operationalCost(consumption, speed);
    }
}
