package com.ss.jb.day2;

public class Rectangle implements Shape{


    private double len, wid;

    public Rectangle(double x, double y){
        this.len = x;
        this.wid = y;
    }

    @Override
    public double calculateArea() {
        return len*wid;
    }

    @Override
    public void display() {

    }
}
