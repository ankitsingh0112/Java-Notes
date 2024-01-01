/*
Construct a superclass called "Shape" with methods to calculate the area and perimeter. Create subclass such as
"Rectangle" and "Circle" that inherit from the Shape class and implement their specific area and perimeter calculations.
 */

import java.util.Scanner;

abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length+breadth);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }
}


public class Q_10 {
    public static void main(String[] args) {
        System.out.println("Enter length and breadth of the rectangle : ");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter radius of the circle : ");
        double r = sc.nextDouble();

        Shape rec = new Rectangle(l, b);
        System.out.println("Area of the rectangle : " + rec.area());
        System.out.println("Perimeter of the rectangle : " + rec.perimeter());

        Shape circle = new Circle(r);
        System.out.println("Area of the circle : " + circle.area());
        System.out.println("Perimeter of the circle : " + circle.perimeter());
    }
}
