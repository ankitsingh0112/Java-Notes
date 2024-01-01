import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        // to print on console we have "println" method inside PrintStream class
        // "out" comes from System class
        System.out.println("Enter a number : ");

        // Input from users :

        // Method 01 :-

        // to take input from user we have "read" method
        // "in" comes from System class
        // it returns "int"
        // it also throws a "IOException"... either we can handle with try and catch or we can just pass to main method
        // it returns the "ascii value"
        // it only takes one value at a time...

        //int num = System.in.read();
        //System.out.println("You Entered : " + (num-48));

        // Method 02 :-

        /*
        InputStreamReader in = new InputStreamReader(System.in);  // InputStreamReader requires System.in
        BufferedReader br = new BufferedReader(in);  // BufferedReader requires InputStream (in which we can pass the file or anything from where we want to take input)
        // br needs to close bcoz to free the resources

        // it returns string
        int num = Integer.parseInt(br.readLine()); // converting string to int

        System.out.println("You Entered : " + num);

        br.close();

         */

        // Method 03 :-
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("You Entered : " + num);
    }
}
