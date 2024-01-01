// Static Variable :-
/*
When a variable is declared static in Java programming, it means that the variable belongs to the class itself
rather than to any specific instance of the class. This means that there
is only one copy of the variable in memory, regardless of how many instances of the class are created.
 */
class Mobile {
    String company;
    String model;
    int price;
    // Static variable
    static String type; // we can set the value initially...

    // static block is used to initialize the static variable...
    // it will be called once irrespective of how many objects we create....
    static{
        type = "5g Smartphone";
        System.out.println("Inside Static block");
    }

    // constructor is called everytime a new object is created but static block is called only once...
    public Mobile() {
        System.out.println("Inside Constructor");
    }

    public void show() {
        System.out.println("Company -> " + company + " :: Model -> " + model + " :: " + "Price -> " + price + " :: " + "Type -> " + type);
    }

    //static method
    public static void show1() {
        // we can use static variable inside static method but cannot use normal(instance) variable inside static method...
        System.out.println("Inside Static Method <---> " + "static var used insed static method -> " + type);
    }
}

public class StaticVar {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.company = "OnePlus";
        obj1.model = "Nord CE 3";
        obj1.price = 25000;
//        Mobile.type = "5g Smartphone";

        Mobile obj2 = new Mobile();
        obj2.company = "Motorola";
        obj2.model = "Edge 40 Neo";
        obj2.price = 23000;
//        Mobile.type = "5g Smartphone"; // we can also set the value of static var inside main
        Mobile.type = "Keypad Phone"; // if we change the value of static variable then the value will be changed for
        // every object....

        obj1.show();
        obj2.show();

        Mobile.show1(); // we can only call static method by class name...
        // we don't need to create object for a static method........
    }
}