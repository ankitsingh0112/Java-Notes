// Thread & Multi-Thread :-
// A thread is a control/flow/path of execution that exists within a process. A process
// may have one or more threads in it and is referred as single-threaded or multi-threaded process respectively.
// In a single-threaded process, there is only one flow to execution of instructions, whereas a
// multi-threaded process has multiple sets of instructions that are executed concurrently; it hence has multiple
// concurrent flows/paths of execution.


// Now creating Thread :-

// 1) Extending Thread :-
/*
One way to create threads is to write a class extending the Thread class and overriding its run() method as follows:

 */

class A extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
            // Using sleep :
            // A thread can be made suspended using sleep() method.
            // Note that duration specified in sleep() is not guaranteed to be precise, because it is limited by the facilities
            // provided by the underlying OS.
            // Also, the sleep() may throw an InterruptedException if the current thread is interrupted.
            // we can handle that use try and catch...
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// 2) implementing Runnable :-
/*
Although, we can create threads extending the Thread class, it has an inherent problem.
Since, Java does not support multiple inheritance for classes, if a class has to extend another class,
it cannot extend Thread. Fortunately, Java provides an alternative way to create threads where we create
a class implementing the Runnable interface as follows:
 */


class C implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Tata");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bye-Bye");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// Note : Before working with threads, ensure that the data is immutable... if data is mutable then there is chance that we can get wrong output...
// to get the correct output when working with mutable data we can use join() method and synchronized keyword...
// Example :

class Counter {
    int count; // by default its value is 0 bcoz it is s instance variable...
    public synchronized void increment() {
        count++;
    }
}

public class AllAboutThread {
    public static void main(String[] args) throws InterruptedException { // throws due to join() method
        // 1) extending thread :
        /*
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
//        System.out.println("Current priority of obj1 : " + obj1.getPriority());
//        System.out.println("Name of obj1 : " + obj1.getName());
//        System.out.println("Current priority of obj2 : " + obj2.getPriority());
//        System.out.println("Name of obj2 : " + obj2.getName());
         */

        // 2) implementing Runnable :-
        /*
        Runnable obj3 = new C();
        Runnable obj4 = new D();

        // Thread can take a runnable object as argument and creates a thread object...
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);

        t1.start();
        t2.start();

         */

        Counter c = new Counter();
        // using lambda expression to create run method directly
        Runnable obj5 = () -> {
                for(int i = 0; i < 1000; i++) {
                    c.increment();
            }
        };

        Runnable obj6 = () -> {
                for(int i = 0; i < 1000; i++) {
                    c.increment();
            }
        };

        Thread t3 = new Thread(obj5);
        Thread t4 = new Thread(obj6);

        t3.start();
        t4.start();

        t3.join();
        t4.join();
        /*
        working :-
                main (thread)
                    |
                    |
                <---|--->
                |   |   |
         t3(thread) | t4(thread)
                |   |   |
                --->|<---
                    | both thread completed their work in synchronized way
                    |
                   main (thread)
         */

        System.out.println("Value of count = " + c.count);
    }
}
