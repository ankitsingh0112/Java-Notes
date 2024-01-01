/*
>>>>Abstraction in Java:-

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example,
sending SMS where you type the text and send the message.
You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

-->>> Abstract class in Java:-

A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember :
<> An abstract class must be declared with an abstract keyword.
<> It can have abstract and non-abstract methods.
<> It cannot be instantiated.
<> It can have constructors and static methods also.
<> It can have final methods which will force the subclass not to change the body of the method.

--->>>Abstract Method in Java:-

A method which is declared as abstract and does not have implementation is known as an abstract method.
 */

abstract class Car {
    // when we do not define any method then declare it as an abstract method so that any child class will define it...
    // Note : Abstract methods can only be created inside an abstract class...
    // Note : the inherited class must define the abstract method otherwise that class also become abstract class or give error...
    public abstract void drive();
    public abstract void fly();
    public void playMusic() {
        System.out.println("Music is playing...");
    }
}

abstract class Jaguar extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdatedJaguar extends Jaguar { // concrete class
    public void fly() {
        System.out.println("Flying...");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
//        Car c1 = new Car(); // we can't create object of an abstract class but we can take reference of abstract class...
//        Car c1 = new Jaguar(); // if the child class also not able to define all the abstract method then we cannot create object of it...
        Car c1 = new UpdatedJaguar();
        c1.playMusic();
        c1.drive();
        c1.fly();
    }
}
