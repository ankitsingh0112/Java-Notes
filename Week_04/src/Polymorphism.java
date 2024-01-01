/*
Dynamic Method Dispatch or Runtime Polymorphism in Java :-

Method overriding is one of the ways in which Java supports Runtime Polymorphism.
Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time,
rather than compile time.

--> When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses)
of that method is to be executed based upon the type of the object being referred to at the time the call occurs.
Thus, this determination is made at run time.
--> At run-time, it depends on the type of the object being referred to (not the type of the reference variable)
that determines which version of an overridden method will be executed
--> A superclass reference variable can refer to a subclass object. This is also known as upcasting.
Java uses this fact to resolve calls to overridden methods at run time.

Therefore, if a superclass contains a method that is overridden by a subclass,
then when different types of objects are referred to through a superclass reference variable,
different versions of the method are executed.
 Here is an example that illustrates dynamic method dispatch:
 */

class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}

class B extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}

class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A ref = new A(); // reference is created and pointing to the object of class A
        ref.m1(); // calling A's version of m1

        // now pointing to the object of class B
        ref = new B();
        ref.m1(); // calling B's version of m1

        // now pointing to the object of class C
        ref = new C();
        ref.m1(); // calling C's version of m1
    }
}