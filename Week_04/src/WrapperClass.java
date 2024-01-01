/*
Wrapper classes in Java :-
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

Autoboxing :-
The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float,
boolean to Boolean, double to Double, and short to Short.

Unboxing:-
The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.
It is the reverse process of autoboxing.
 */

public class WrapperClass {
    public static void main(String[] args) {
        //Java program to convert primitive into objects
        //Autoboxing example of int to Integer
        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly (this is used earlier, before JAVA 5)
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally (this is used currently)

        System.out.println(a+" "+i+" "+j);

        //Java program to convert object into primitives
        //Unboxing example of String to int
        //Converting Integer to int
//        Integer b=new Integer(3);
        Integer b = 3; // we can directly assign the value
        int m=b.intValue();//converting Integer to int explicitly
        int n=b;//unboxing, now compiler will write a.intValue() internally

        System.out.println(b+" "+m+" "+n);

        // another example of String to int conversion
        String str = "12";
        int k = Integer.parseInt(str); // auto-unboxing
        System.out.println(k*2);
    }
}
