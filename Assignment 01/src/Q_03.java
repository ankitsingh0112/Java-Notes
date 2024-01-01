/*
Create a Java program to calculate the simple interest.
 */

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        System.out.println("Enter the Principal amount, interest rate and time period : ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        double si = (double) (p * r * t) /100;
        System.out.println("Simple Interest : " + si);
    }
}
