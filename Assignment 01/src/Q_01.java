/*
Create a Java program that functions as a basic calculator. It should take two numbers and perform operation like addition,
subtraction, multiplication and division based on user input.
 */

import java.util.Scanner;

import static java.lang.Math.abs;

class BasicCacl{
    public int add(int n1, int n2) {
        return n1+n2;
    }
    public int sub(int n1, int n2) {
        return abs(n1-n2);
    }
    public int mul(int n1, int n2) {
        return n1*n2;
    }
    public int div(int n1, int n2) {
        return n1>n2? n1/n2 : n2/n1;
    }
}

public class Q_01 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        BasicCacl bc = new BasicCacl();
        System.out.println("Addition : " + bc.add(n1, n2));
        System.out.println("Subtraction : " + bc.sub(n1, n2));
        System.out.println("Multiplication : " + bc.mul(n1, n2));
        System.out.println("Division : " + bc.div(n1, n2));
    }
}