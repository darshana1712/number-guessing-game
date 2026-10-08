import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100!");

        while (true) {
            System.out.print("Your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You got it in " + attempts + " attempts.");
                break;
            }
        }
        sc.close();
    }
}
