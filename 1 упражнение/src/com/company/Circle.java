package com.company;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
        this.filled=false;
        this.color="blue";
        this.radius=radius;
    }

    public Circle(double radius) {
        this.filled=false;
        this.color="blue";
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.color=color;
        this.filled=filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return  2*Math.PI*radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
