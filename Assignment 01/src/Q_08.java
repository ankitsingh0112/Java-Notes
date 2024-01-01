/*
Construct a class representing a "Person" with private attributes like name, age, and ID.
Implement public methods to access and modify these attributes in a controlled manner.
 */

class Person {
    private String name;
    private int age;
    private int ID;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}


public class Q_08 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setID(1);
        p1.setName("Rahul");
        p1.setAge(23);

        System.out.println("ID : " + p1.getID());
        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());

        Person p2 = new Person();
        p2.setID(2);
        p2.setName("Ram");
        p2.setAge(24);

        System.out.println("ID : " + p2.getID());
        System.out.println("Name : " + p2.getName());
        System.out.println("Age : " + p2.getAge());
    }
}
