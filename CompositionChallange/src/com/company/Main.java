package com.company;

public class Main {

    public static void main(String[] args) {
        Window window = new Window(1,1,1);
	    Room room = new Room(window,1,1);
        System.out.println(room.getWindow().getColour());

        room.airWindow();

    }
}
