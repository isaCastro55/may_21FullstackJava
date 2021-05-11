package com.ss.jb.day2;

public class Circle implements Shape{
    private double rad;

    public Circle(double x){

        this.rad = x;
    }


    @Override
    public double calculateArea() {
        return (Math.PI*Math.pow(rad,2));
    }

    @Override
    public void display() {

    }
}
