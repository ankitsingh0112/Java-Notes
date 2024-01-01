
// know more about exception : https://www.javatpoint.com/exception-handling-in-java

// Exception Handling is mainly used to handle the checked exceptions.
// If there occurs any unchecked exception such as NullPointerException,
// it is programmers' fault that he is not checking the code before it being used.

//unchecked exception: under our control so we can correct our code.
//error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

// custom exception
class AnkitException extends Exception {
    public AnkitException(String string) {
        super(string);
    }
}

// throws keyword
class Demo {
    public void d() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) throws IOException { // throws coming from finally
        //int i = 22;
        //int j = 0;
        //int[] nums = new int[5];
        /*
        // try with single catch
        try {
            j = 24/i;
        }
        catch (Exception e) {
            System.out.println("Divide by zero is not possible... " + e);
        }
         */

        /*
        // try with multiple catch
        try {
            System.out.println(nums[2]);
            System.out.println(nums[5]);
        }
        // if we know that what type of exception will be generate then we can directly use that exception in the catch block
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array length out of bound...");
        }
        // if we don't know what type of exception will generate then we can use this catch block
        catch(Exception e) {
            System.out.println("Something went wrong..." + e);
        }

         */

        /*
        // throw keyword in java
        try{
            j = 18/i;
            if(j == 0) {
//                throw new ArithmeticException(); // calling the exception
                throw new ArithmeticException("result become zero."); // calling exception with a message
            }
        }
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("result should not be zero that's why default value = " + j + " : " + e);
        }

         */

        /*
        // custom exception
        try{
            j = 18/i;
            if(j == 0) {
                throw new AnkitException("result become zero."); // calling exception with a message
            }
        }
        catch (AnkitException e) {
            System.out.println("Something went wrong..." + e);
        }

         */

        /*
        // Throws keyword :
        //The Java throws keyword is used to declare an exception. It gives an information to the programmer that
        // there may occur an exception. So, it is better for
        // the programmer to provide the exception handling code so that the normal flow of the program can be maintained.

        // when a specific method do not handle the exception by their own they throws the exception from where that method is called...

        Demo obj = new Demo();
        try {
            obj.d();
        } catch (ClassNotFoundException e) {
            System.out.println("Something went wrong with class Demo..." + e);
        }

         */


        /*
        // finally keyword in java :-
        int i = 0;
        int j = 0;
        int num;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter a number : ");
        try {
            //j = 12/i;
            //System.out.println("Hello"); // it doesn't run because exception occurs...

            num = Integer.parseInt(br.readLine()); // readLine throws a IOException which is handled by main
            System.out.println("You entered : " + num);
        }
        //catch(Exception e) {
        //    System.out.println("Something caught...");
        //}

        // whatever written inside the finally block it will be executed irrespective of exception caught or not...
        // we can also do not use the catch block if we are using finally...
        // whenever we use resources we should use finally to close/free the resources...
        finally {
            //System.out.println("Hello");
            br.close();
        }

         */

        // instead of using finally to free the resources we can use try with resource...

        // try with resources :-
        // whenever we have class or interface which is AutoClosable we can use try with resource to free the resources that means it will be automatically closed when it comes out from try...
        int num;
        System.out.println("Enter a number : ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
        }
        System.out.println("You entered : " + num);


        System.out.println("Tata Bye-bye");
    }
}
