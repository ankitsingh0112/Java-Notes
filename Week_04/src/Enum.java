/*
ENUM :-
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
Note that they should be in uppercase letters(not necessary but for naming convention)...

>>Note : we can't extends the enum(means inheritance is not allowed) expect this all are same as class...
 */


enum Status {
    Running, Failed, Waiting, Success; // these are objects of enum class...
}

enum Lappi {
    Hp(60000), Lenovo, Asus(55000), Apple(90000); // since these are objects of a enum class so that they have constructor

    private int price;

    Lappi() {
        price = 45000;
    }

    Lappi(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum {
    public static void main(String[] args) {
//        Status s = Status.Success; // to get individual enum
//        System.out.println(s);

        Status[] ss = Status.values(); // to get all enums in the form of array...
        System.out.println(ss[2]);

        System.out.println();

        // accessing individual enum
//        Lappi l1 = Lappi.Apple;
//        System.out.println(l1 +" " + l1.getPrice());

        // accessing all enums
        for(Lappi l : Lappi.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
