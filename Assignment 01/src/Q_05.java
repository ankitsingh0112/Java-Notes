/*
Random number guessing game
 */

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*10);
        System.out.println("Guess the number between 1 to 10 in 3 attempts...");
        Scanner sc = new Scanner(System.in);
        int attempt = 1;
        for(int i = 0; i < 3; i++) {
            int guess = sc.nextInt();
            if(guess == rand) {
                System.out.println("Congrats! You guessed the number in " + attempt + " attempt(s)");
                break;
            }
            else if(guess > rand && attempt < 3) {
                System.out.println("Oops!!! try smaller value...");
            }
            else if(guess < rand && attempt < 3) {
                System.out.println("Nope! try larger value...");
            }
            attempt++;
        }
        if(attempt > 3) {
            System.out.println("Your attempt is over!!!");
            System.out.println("The number is : " + rand);
        }
        System.out.println("Game Over!!!");
    }
}
