package com.company;

public class Room {
    private Window window;
    private int wall;
    private int floor;



    public Room(Window window, int wall, int floor){
        this.window = window;
        this.wall = wall;
        this.floor = floor;

    }

    public Window getWindow() {
        return window;
    }

    public int getWall() {
        return wall;
    }

    public int getFloor() {
        return floor;
    }
     public void airWindow(){
        window.openWindow();
         System.out.println("fresh air is in");
    }
}
