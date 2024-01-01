// Encapsulation :-
/*
Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are
integrated as a single unit. By encapsulating a class's variables, other
classes cannot access them, and only the methods of the class can access them.
 */

class Human {

    // to ensure privacy
    // we keep variable as private so that no one can access these variable from outside the human class
    private int age;
    private String name;

    // we can use getter and setter to access these private var from outside class...
    // setter
    public void setAge(int age) {
        this.age = age;
    }

    // getter
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Ankit");
        obj.setAge(21);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
