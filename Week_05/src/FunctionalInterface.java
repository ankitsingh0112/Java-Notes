
// functional interface is used when we want only one method inside a interface...
// it is also called as SAM -> Single Abstract Method
// function interface is a type of interface which has only one method....

@java.lang.FunctionalInterface // we use annotation to avoid errors(suppose by mistake we created 2 methods inside the functional interface then this annotation will give error before compiling)...
interface Test {
    void show();
}

//class Test2 implements Test {
//    public void show() {
//        System.out.println("Helloo");
//    }
//}


public class FunctionalInterface {
    public static void main(String[] args) {
//        Test t = new Test2();
        Test t = new Test() {
            public void show() {
                System.out.println("Helloooooo");
            }
        };
        t.show();
    }
}