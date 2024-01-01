// when we want to avoid inheritance or method overriding then we use anonymous inner class...
// we can use anonymous inner class for abstract class also...

class Topa {
    public void Ponga() {
        System.out.println("Ponga is a Pandit...");
    }
}

abstract class Inki {
    public abstract void show();
    public abstract void display();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Topa obj = new Topa(){
            public void Ponga() {
                System.out.println("Topa and Ponga is best friend and they both are Pandit");
            }
        };
        obj.Ponga();

        // we can directly define the abstract method using anonymous inner class without creating a new class...
        Inki obj1 = new Inki() {
            public void show() {
                System.out.println("Inki Pinky Ponky....");
            }

            public void display() {
                System.out.println("Father bought a donkey....");
            }
        };
        obj1.show();
        obj1.display();
    }
}
