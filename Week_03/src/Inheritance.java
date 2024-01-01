import static java.lang.Math.abs;


/*
Inheritance :-

 */

// Parent/Super/Base class :
class Calc {
    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int sub(int n1, int n2) {
        return abs(n1-n2);
    }
}

// Child/Sub/Derived class :

// we can use the methods and instances of the parent class in the child class

// single inheritance :
class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1*n2;
    }

    public int div(int n1, int n2) {
        return n1/n2;
    }
}

// Multi-level Inheritance :
class VeryAdvCalc extends AdvCalc{
    public int power(int n1, int n2){
        return ((int)(Math.pow(n1,n2)));
    }
}

// NOTE :- Java does not support multiple inheritance....

public class Inheritance {
    public static void main(String[] args) {
//        AdvCalc c1 = new AdvCalc(); // --> single inheritance
        VeryAdvCalc c1 = new VeryAdvCalc(); // --> multi-level inheritance
        System.out.println(c1.add(3,6));
        System.out.println(c1.sub(3,9));
        System.out.println(c1.mul(8,8));
        System.out.println(c1.div(46,7));
        System.out.println(c1.power(4,3));
    }
}
