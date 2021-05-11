package com.ss.jb.day2;

public class Rectangle implements Shape{


    private Double len, wid, area;

    public Rectangle(double x, double y){
        this.len = x;
        this.wid = y;
    }

    @Override
    public void calculateArea() {
        area = len*wid;
    }

    @Override
    public void display() {
        System.out.println("The area of this Rectangle is: "+area);

    }
}
