
// if we make any class as final then no one can inherit it...
// final class Calc{
class Calc{
    // if we make a method as final then no one can override it...
//    public final void show() {
    public void show() {
        System.out.println("Calc is made by Inky");
    }
    public void add(int a, int b) {
        System.out.println("Sum : " + a+b);
    }
}

// this inheritance is not possible bcoz parent class is made final...
class AdvCalc extends Calc {
    // we can't override a method which is set as final...
    public void show() {
        System.out.println("Inky Pinky Ponkey");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 7; // final is similar to const in c++...
        // if we make any variable as final then we can't change the value....
//        num = 9; // we can't change the value of num bcoz it is final
        Calc c = new Calc();
    }
}
