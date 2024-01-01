
class Student<T>
{
    T obj;

    Student(T obj) {
        this.obj = obj;
    }

    public void display() {
        System.out.println("Type of data passed as T : " + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}

public class Generics {
    public static void main(String[] args) {
        Student<Integer> stu1 = new Student<>(12);
        stu1.display();
        System.out.println(stu1.getObj());
        Student<String> stu2 = new Student<>("Ram");
        stu2.display();
        System.out.println(stu2.getObj());
    }
}
