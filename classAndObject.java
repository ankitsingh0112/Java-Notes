class Calculator{
    public int add(int n1, int n2) {
        return n1+n2;
    }
}

public class classAndObject {
    public static void main(String []args) {
        int num1 = 6;
        int num2 = 3;
        Calculator calc = new Calculator(); // this is used to create new object
        int res = calc.add(num1, num2);
        System.out.println(res);
    }
}
