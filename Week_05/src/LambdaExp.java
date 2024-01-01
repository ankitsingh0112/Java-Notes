// Lambda expression is only works with functional interface...

@java.lang.FunctionalInterface
interface AA{
    // function with no arguments
    void show();
}

interface BB {
    // function with return type and arguments
    int add(int i, int j);
}
public class LambdaExp {
    public static void main(String[] args) {
        // normal way to use interface
//        AA obj = new AA(){
//            public void show(){
//                System.out.println("Inside Z");
//            }
//        };

        // using lambda exp :-
        AA obj = () -> System.out.println("Inside AA");
        obj.show();

        BB obj1 = (i, j) -> i+j;
        int res = obj1.add(5,4);
        System.out.println("Sum : " + res);
    }

}
