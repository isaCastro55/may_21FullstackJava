package com.ss.jb.day2;

public class Triangle implements Shape{
    private double base, height;

    public Triangle(double x, double y){
        this.base = x;
        this.height = y;
    }
    @Override
    public double calculateArea() {
        return (.5*base*height);
    }

    @Override
    public void display() {

    }
}
