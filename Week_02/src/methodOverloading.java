// Method Overloading : Naam same kaam alag....
class Calculator{
    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    public double add(double n1, int n2) {
        return n1+n2;
    }
}

public class methodOverloading {
    public static void main(AboutString[] args) {
        Calculator calc = new Calculator();
        int r1 = calc.add(3,5,7);
        int r2 = calc.add(4,6);
        double r3 = calc.add(3.5,8);
        System.out.println("Result :-" + r1 + " " + r2 + " " + r3);
    }
}