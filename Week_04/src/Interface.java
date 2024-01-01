/*
>>>>Interface in Java :-

An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface,
not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables.
It cannot have a method body (means defining a method is not allowed).

It cannot be instantiated just like the abstract class.

>>>>Need of Java Interface :-

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.

 */

// Point to remember :
// class -> class ---> extends
// interface -> class ----> implements
// interface -> interface ----> extends

import static java.lang.Math.abs;

interface Computer {
    // we can define variables inside interface but they are static(can be called without creating object) and final(const)...
    int ram = 8;
    String model = "Hp";
    void quality();
    void performance();
}

// interface can be inherited
interface AdvComputer extends Computer {
    void graphics();
}

interface Calculator {
    void basic(int n1, int n2);
    void advance(int n1,int n2);
}

// multiple inheritance with the help of interface...
class Desktop implements AdvComputer, Calculator {
    public void quality() {
        System.out.println("Faster...");
    }

    public void performance() {
        System.out.println("Smoother and Faster...");
    }

    public void graphics() {
        System.out.println("High graphics...");
    }

    public void basic(int n1, int n2) {
        System.out.println("Sum : " + (n1+n2));
        System.out.println("Subtraction : " + abs(n1-n2));
        System.out.println("Multiplication : " + n1*n2);
        System.out.println("Division : " + n1/n2);
    }

    public void advance(int n1, int n2) {
        System.out.println("Sum : " + (n1+n2));
        System.out.println("Subtraction : " + abs(n1-n2));
        System.out.println("Multiplication : " + n1*n2);
        System.out.println("Division : " + n1/n2);
        System.out.println("Modulo : " + n1%n2);
    }
}

class Laptop implements AdvComputer, Calculator {

    public void quality() {
        System.out.println("Lite Weight...");
    }

    public void performance() {
        System.out.println("Smooth and fast...");
    }

    public void graphics() {
        System.out.println("Medium graphics...");
    }

    public void basic(int n1, int n2) {
        System.out.println("Sum : " + n1+n2);
        System.out.println("Subtraction : " + abs(n1-n2));
    }

    public void advance(int n1, int n2) {
        System.out.println("Multiplication : " + n1*n2);
        System.out.println("Division : " + n1/n2);
    }
}

class Developer {
    public void code(AdvComputer obj, Calculator objC) {
        obj.performance();
        obj.quality();
        obj.graphics();
        objC.basic(8,4);
        objC.advance(96,12);
    }
}

public class Interface {
    public static void main(String[] args) {
        AdvComputer lapi = new Laptop();
        AdvComputer desk = new Desktop();
        Calculator calDesk = new Desktop();
        Calculator calLap = new Laptop();

        // developer 1 needs desktop to work
        Developer dev1 = new Developer();
        dev1.code(desk, calDesk);

        // developer 2 needs laptop to work
        Developer dev2 = new Developer();
        dev2.code(lapi, calLap);
    }
}
