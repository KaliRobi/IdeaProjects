package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int y, int x){
        this.x = x;
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public void setY(int yn){
        y = yn;
    }
    public int getX(){
        return x;
    }
    public void setX(int xn){
        x = xn;
    }
    public double distance(){
        return (double) Math.sqrt((getX()-0)^2*(getY()-2));
    }
    public double distance(int yn, int xn){
        return Math.sqrt((new Point().getX()-yn)^2*(new Point().getY()-yn)^2)
    }
}

















