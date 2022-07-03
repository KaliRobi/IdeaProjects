package com.company;

public class Window {
    private int glass;
    private int colour;
    private int frame;

    public Window(int glass, int colour, int frame){ // capital letter
        this.glass = glass;
        this.colour = colour;
        this.frame = frame;
    }

    public int getGlass() {
        return glass;
    }

    public int getColour() {
        return colour;
    }

    public int getFrame() {
        return frame;
    }

    public void openWindow(){
        System.out.println("opened the window");
    }
}
