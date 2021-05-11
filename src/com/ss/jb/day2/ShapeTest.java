package com.ss.jb.day2;

public class ShapeTest {
    public static void main(String[] args){
        Shape earth = new Circle(3.4);
        Shape pyramid = new Triangle(5,6);
        Shape box = new Rectangle(4,6);

        earth.calculateArea();
        pyramid.calculateArea();
        box.calculateArea();

        earth.display();
        pyramid.display();
        box.display();

    }

}
