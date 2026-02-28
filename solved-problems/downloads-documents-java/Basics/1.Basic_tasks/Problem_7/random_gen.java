import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

class random_gen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();

        int random = rdm.nextInt(11); 
        int guess, diff;
        int i = 1;

        System.out.println("Guess the random number generated from 0 to 10:");

        while (i <= 10) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < 0 || guess > 10) {
                System.out.println("Invalid input. Please enter a number between 0 and 10.");
                continue;
            }

            if (guess == random) {
                System.out.println("Your guess is right!");
                System.out.println("You got it in " + i + " attempts.");
                break;
            } else {
                diff = Math.abs(guess - random);
                System.out.println("Wrong guess! Your number is " + diff + " away from the random number.");
            }

            i++;
        }

        if (i > 10) {
            System.out.println("You've used all attempts! The random number was: " + random);
        }

        sc.close();
    }
}
