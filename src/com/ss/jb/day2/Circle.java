package com.ss.jb.day2;

public class Circle implements Shape{
    private Double rad,area;

    public Circle(double x){

        this.rad = x;
    }


    @Override
    public void calculateArea() {
        area=(Math.PI*Math.pow(rad,2));
    }

    @Override
    public void display() {
        System.out.println("The area of this Circle is: "+area);

    }
}
