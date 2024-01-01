/*
Palindrome string
 */

import java.util.Scanner;

import static java.lang.System.exit;

public class Q_04 {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int e = s.length() - 1;
        boolean chk = false;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(e--)) {
                System.out.println("Given string is not Palindrome!!!");
                chk = true;
                break;
            }
        }
        if(!chk)
            System.out.println("Given string is Palindrome!!!");
    }
}
