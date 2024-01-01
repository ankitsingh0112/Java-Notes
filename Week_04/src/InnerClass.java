
class ABC {
    int age;
    public void show() {
        System.out.println("Inside class ABC...");
    }

    // when we do not use static keyword before class then it becomes a non-static inner class..
    // NOTE : only inner class can be made static, not outer class...
//    class XYZ {...}
    static class XYZ {
        public void show1() {
            System.out.println("Inside class XYZ...");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        // calling normal class...
        ABC obj = new ABC();
        obj.show();

        // calling a non-static inner-class...
//        ABC.XYZ obj1 = obj.new XYZ(); // to create object of class XYZ, first we need the object of class ABC...

        // calling a static inner-class...
        ABC.XYZ obj1 = new ABC.XYZ(); // when we create static inner class then we don't need any object of outer class...
        obj1.show1();

    }
}
