package com.company;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        this.width=side;
        this.length=side;
    }

    public Square(String color, boolean filled, double side) {
        this.color=color;
        this.filled=filled;
        this.width=side;
        this.length=side;
    }
    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.width=side;
        this.length=side;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
