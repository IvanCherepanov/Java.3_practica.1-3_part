package com.company;

public class Main {

    public static void main(String[] args) {
        //Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        Shape s1 = new Circle("RED", false,5.5);
        System.out.println(s1); // which version?//Circle
        System.out.println(s1.getArea()); // which version?//Circle
        System.out.println(s1.getPerimeter()); // which version?//Circle
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //у фигуры нет такого метода

        System.out.println("!!!!!!!!!!!");

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println("!!!!!!!!!!!");
        //Shape s2 = new Shape();//это абстрактный класс, нельзя создать

        System.out.println("!!!!!!!!!!!");
        Shape s3 = new Rectangle( "RED", false,1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());//у фигуры нет такого метода

        System.out.println("!!!!!!!!!!!");
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println("!!!!!!!!!!!");
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());//у фигуры нет такого метода


// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        System.out.println("!!!!!!!!!!!");
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());//у прямоугольника нет метода, т.к понизили
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        System.out.println("!!!!!!!!!!!");
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        // write your code here
    }
}
