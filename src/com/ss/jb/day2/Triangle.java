package com.ss.jb.day2;

public class Triangle implements Shape{
    private Double base, height,area;

    public Triangle(double x, double y){
        this.base = x;
        this.height = y;
    }
    @Override
    public void calculateArea() {
        area= (.5*base*height);
    }

    @Override
    public void display() {
        System.out.println("The area of this Triangle is: "+area);

    }
}
