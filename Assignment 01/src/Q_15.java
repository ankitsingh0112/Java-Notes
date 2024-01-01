import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class College {
    HashMap<Integer, List<String>> stuDetail = new HashMap<>();
    List<String> details = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addDetails() {
        System.out.print("Enter Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        details.add(name);
        System.out.print("Enter age : ");
        String age = sc.nextLine();
        details.add(age);
        System.out.print("Enter grade : ");
        String grade = sc.nextLine();
        details.add(grade);
        stuDetail.put(id, details);
        System.out.println("Details added!");
    }

    public void displayDetails() {
        System.out.print("Enter the id to get details : ");
        int id = sc.nextInt();
        System.out.println("Details of ID : " + id);
        System.out.println(stuDetail.get(id));
    }
}

public class Q_15 {
    public static void main(String[] args) {
        int input;
        College stu = new College();
        while(true)
        {
            System.out.println("What operation do you want to perform?");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display Student Record");
            System.out.println("3. Update Student Record");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            if(input == 5) {
                break;
            }
            switch (input) {
                case 1 -> stu.addDetails();
                case 2 -> stu.displayDetails();
                default -> System.out.println("Invalid Input!!!");
            }
        }
        System.out.println("Thank You!!!");
    }
}
